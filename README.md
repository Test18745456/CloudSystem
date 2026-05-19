# ☁️ CloudSystem - Hytale Server Cloud Platform

Eine hochperformante Cloud-Plattform für Game-Server, speziell optimiert für Hytale Server. Ähnlich wie CloudNet/Kubernetes, aber selbst gebaut und speziell auf Hytale ausgerichtet.

## 🎯 Vision

Ein verteiltes System zur Verwaltung von:
- 🚀 Game Server Instanzen
- 🖥️ Worker Nodes (Server Maschinen)
- 📊 Ressourcen-Monitoring
- ⚙️ Automatisches Scaling
- 🔄 Load Balancing

## 🏗️ Architektur

```
┌─────────────────────────────────────────────────────────┐
│                  Master Server                          │
│  - Zentrale Verwaltung                                  │
│  - Node Management                                      │
│  - Scheduling                                           │
│  - Monitoring Dashboard                                 │
└─────────────────────────────────────────────────────────┘
         ↕ (Netty TCP + Packet System)
┌─────────────────────────────────────────────────────────┐
│         Worker Nodes (verteilte Infrastruktur)          │
│  ┌──────────────┐  ┌──────────────┐  ┌──────────────┐  │
│  │   Worker 1   │  │   Worker 2   │  │   Worker N   │  │
│  │ - GameServer │  │ - GameServer │  │ - GameServer │  │
│  │ - Monitor    │  │ - Monitor    │  │ - Monitor    │  │
│  └──────────────┘  └──────────────┘  └──────────────┘  │
└─────────────────────────────────────────────────────────┘
```

## 📦 Module

| Modul | Beschreibung |
|-------|-------------|
| **nythera-api** | Öffentliche Schnittstellen & Datenmodelle |
| **nythera-core** | Basis-Logik & Utilities |
| **nythera-network** | Netty-basierte Netzwerk-Kommunikation |
| **nythera-master** | Master Server & Zentrale Verwaltung |
| **nythera-worker** | Worker Node & Server Management |

## ✨ Features

### Phase 1: Grundlagen ✅
- ✅ Netzwerk-Kommunikation (Netty TCP)
- ✅ Worker → Master Verbindung
- ✅ Einfaches Packet System
- ✅ Node Registration

### Phase 2: Server Management 🚀
- 📋 Game Server starten/stoppen
- 📊 Prozess-Überwachung
- 🔍 Crash Detection
- 💾 Ressourcen Management

### Phase 3: Cloud Features ⚙️
- 📈 CPU/RAM Monitoring
- 🧠 Smart Scheduler
- 🔥 Pre-Warmed Server Pool
- ⚖️ Load Balancing
- 🔄 Auto Scaling

### Phase 4: Sicherheit 🔐
- 🔒 Verschlüsselte Verbindungen
- 🔑 Node Authentication
- 🛡️ Sichere Packet-Kommunikation

## 🚀 Quick Start

### Voraussetzungen
- Java 17+
- Maven 3.8+
- Linux/Windows Server

### Build
```bash
mvn clean install
```

### Master Server starten
```bash
java -jar nythera-master/target/master.jar
```

### Worker Node starten
```bash
java -jar nythera-worker/target/worker.jar --master-host localhost --master-port 9000
```

## 📂 Projektstruktur

```
CloudSystem/
├── nythera-api/              # API & Interfaces
├── nythera-core/             # Core Utilities
├── nythera-network/          # Netty Netzwerk
├── nythera-master/           # Master Server
├── nythera-worker/           # Worker Node
├── pom.xml                   # Parent Maven Config
└── README.md
```

## 🔌 Kommunikation

Das System nutzt ein Packet-basiertes Protokoll:

```
[HEADER] [PACKET_ID] [DATA_LENGTH] [DATA] [CHECKSUM]
```

### Standard Packets
- `HELLO` - Initiale Verbindung
- `HEARTBEAT` - Keep-Alive
- `START_SERVER` - Server starten
- `STOP_SERVER` - Server stoppen
- `STATUS_UPDATE` - Status-Meldung

## 📊 Monitoring & Dashboard

- **Web Dashboard** für Server-Verwaltung
- **Real-time Metrics** von Workers
- **Log Streaming** für Debug
- **Alert System** für Ausfälle

## 🔐 Sicherheit

- TLS/SSL Verschlüsselung
- Token-basierte Node-Authentifizierung
- Packet Signing & Validation
- Firewall Regeln

## 📝 Lizenz

MIT License - Frei nutzbar & erweiterbar

## 👨‍💻 Entwicklung

Contributions sind willkommen! Bitte erstelle einen Pull Request mit:
- Aussagekräftiger Beschreibung
- Tests für neue Features
- Dokumentation

---

**Status**: 🟢 Aktive Entwicklung - Phase 1-2 in Arbeit
