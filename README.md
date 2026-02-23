# Corvid's Better Diable Avionics

[![License](https://img.shields.io/badge/license-Community%20Open%20Source-blue.svg)](https://github.com/Zone51alex/CER_BetterDA/blob/main/license.txt)
[![Releases](https://img.shields.io/github/v/release/Zone51alex/CER_BetterDA?color=red)](https://github.com/Zone51alex/CER_BetterDA/releases)

---

## Table of Contents

- [Overview](#overview)
- [Goals](#goals)
- [Changes Included](#changes-included)
- [Compatibility](#compatibility)
- [Dependencies](#dependencies)
- [Download](#download)
- [Credits](#credits)
- [License](#license)

---

## Overview

**CER Better DA** is a refinement mod for **Diable Avionics** that focuses on improving ship variants, weapons, and ShipSystems.  
The goal is to help the faction function more reliably for both AI and player fleets — without increasing difficulty or altering the intended balance.  

This is a **functionality and polish mod**, not a “hard mode” or full rebalance.

---

## Goals

- Improve AI performance and decision-making  
- Fix the most problematic weapons  
- Refine ShipSystem behavior for better usability  
- Update and polish all variants  
- Preserve Diable Avionics’ intended strength and identity  

---

## Changes Included

### Ship Adjustments
- **Storm**  
  - Removed battlecarrier combat tag  
  - Purpose: 1) Mod indicator that Corvid's Better DA is Correctly installed, 2) Storm does not have stats to function as a Battlecarrier.  
- **Calm**  
  - ShipSystem AI heavily improved (it fully utilizes buffs during combat).  
- **Damper Wave**
  - Changed AI type to `TEMPORAL_SHELL` for better AI usage.

### Weapon Changes
- **Winee EMPR**: Main offender; The `FIRE_WHEN_INEFFICIENT` on it was basically a Dumping Flux Weapon acidentally Designed to Troll both the player and the a.i. alike, Changed to `USE_LESS_VS_SHIELDS`.
- **Other weapons** (Artassault Revolver Cannon, Glowtusk Linear Rifle, Glowfang Equation Rifle, State Support Beam) updated for better AI usability (`USE_LESS_VS_SHIELDS` tag added as appropriate)  

### Variant / Patrol Improvements
- All variants have been improved to function correctly with both AI and player fleets  
- Patrol setup updated for Corvid using Diable Avionics ships:
  - Frigates (done)   
  - Destroyers (done)   
  - Cruisers (done)   
  - Capitals (done)  
  - Super Capitals (done) 

---

## Compatibility

- Built to follow the same Starsector version as Diable Avionics  
- Works alongside Nexerelin and other faction mods  
- No lore changes or forced difficulty shifts  

---

## Dependencies

- [MagicLib](https://github.com/MagicLibStarsector/MagicLib)  
- [LazyLib](https://github.com/LazyWizard/lazylib)  
- *(Optional)* [LunaLib](https://github.com/Lukas22041/LunaLib)  

---

## Download

 **[Releases](https://github.com/Zone51alex/CER_BetterDA/releases)**

---

## Credits

- **Zone51** – Creator & Maintainer  

---

## License

Corvid's Better Diable Avionics follows the same community reuse license as Diable Avionics.

**[license.txt](https://github.com/Zone51alex/CER_BetterDA/blob/main/license.txt)**
