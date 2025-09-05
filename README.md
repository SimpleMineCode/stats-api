# Stats API (PaperMC Plugin)

A PaperMC plugin that provides a centralized **stats API** for Minecraft servers.  
It gives **developers** a clean API for storing and retrieving stats, while also letting **admins** control which player stats are tracked with simple in-game commands.

## ✨ Features

- 📊 **Centralized statistics management** – avoid reinventing the wheel for each minigame.
- 🔌 **Developer API** – expose stats through a clean API for plugins and gamemodes.
- ⚙️ **Planned Admin commands** – choose which predefined metrics are collected directly in-game.
- 🗄️ **Planned: database support** – connect to SQL or NoSQL backends for persistence.
- 🌐 **Planned: web frontend** – view, filter, and analyze player stats outside the game.

## 🚀 Getting Started

### Requirements
- [PaperMC](https://papermc.io/) (latest supported version)
- Java 21+ (depending on Paper version)

### Installation
1. Download the latest release (not yet available — build from source for now).
2. Place the plugin JAR into your server’s `plugins/` directory.
3. Restart or reload your server.

### Building from Source
```bash
git clone https://github.com/SimpleMineCode/stats-api.git
cd stats-api
mvn clean package
