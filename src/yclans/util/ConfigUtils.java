package yclans.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import com.google.common.base.Charsets;

public class ConfigUtils {

    private File f;
    private FileConfiguration cfg;
	
	private String path_;
	private String fileName_;
	
	private Plugin main;
	
	public ConfigUtils(String path, String fileName, Plugin javaPluginExtender) {
		main = javaPluginExtender;
		
		path_ = path;
		fileName_ = fileName;
	}

	public void reloadConfig() {
		cfg = YamlConfiguration.loadConfiguration(f);
		InputStream defConfigStream = this.getResource(fileName_);
		if(defConfigStream != null) {
			cfg.setDefaults(YamlConfiguration.loadConfiguration(new InputStreamReader(defConfigStream, Charsets.UTF_8)));
		}
	}

	public ConfigUtils create() {
		f = new File(path_, fileName_);
		cfg = YamlConfiguration.loadConfiguration(f);
		return this;
	}

	public void setDefault(String filename) {
		InputStream defConfigStream = main.getResource(filename);
		if (defConfigStream == null)
			return;
		YamlConfiguration defConfig;
		defConfig = YamlConfiguration.loadConfiguration(new InputStreamReader(defConfigStream, Charsets.UTF_8));
		cfg.setDefaults(defConfig);
	}
	
	public void saveConfig() {
		try {
			cfg.save(f);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public FileConfiguration getConfig() {
		return cfg;
	}
	
	public File toFile() {
		return f;
	}

	public void saveDefaultConfig() {
		if (!exists()) {
			saveResource(fileName_, false);
		}
	}

	public void saveResource(String resourcePath, boolean replace) {
		if (resourcePath != null && !resourcePath.equals("")) {
			resourcePath = resourcePath.replace('\\', '/');
			InputStream in = this.getResource(resourcePath);
			if (in == null) {
				throw new IllegalArgumentException("The embedded resource '" + resourcePath + "' cannot be found in " + toFile());
			} else {
				File outFile = new File(path_, resourcePath);
				int lastIndex = resourcePath.lastIndexOf(47);
				File outDir = new File(path_, resourcePath.substring(0, lastIndex >= 0 ? lastIndex : 0));
				if (!outDir.exists()) {
					outDir.mkdirs();
				}
				
				try {
					if (outFile.exists() && !replace) {
						main.getLogger().log(Level.WARNING, "Could not save " + outFile.getName() + " to " + outFile + " because " + outFile.getName() + " already exists.");
					} else {
						OutputStream out = new FileOutputStream(outFile);
						byte[] buf = new byte[1024];

						int len;
						while((len = in.read(buf)) > 0) {
							out.write(buf, 0, len);
						}
						out.close();
						in.close();
					}
				} catch (IOException var10) {
					main.getLogger().log(Level.SEVERE, "Could not save " + outFile.getName() + " to " + outFile, var10);
				}
			}
		} else {
			throw new IllegalArgumentException("ResourcePath cannot be null or empty");
		}
	}

	public InputStream getResource(String filename) {
		if (filename == null) {
			throw new IllegalArgumentException("Filename cannot be null");
		} else {
			try {
				URL url = this.getClass().getClassLoader().getResource(filename);
				if (url == null) {
					return null;
				} else {
					URLConnection connection = url.openConnection();
					connection.setUseCaches(false);
					return connection.getInputStream();
				}
			} catch (IOException var4) {
				return null;
			}
		}
	}

	public boolean exists() {
        return f.exists();
	}
}