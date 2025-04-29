# Progetto Java: Esercizi su Classi, Ereditarietà e File

Questo progetto contiene tre esercizi principali scritti in Java, pensati per esercitarsi con i concetti base della programmazione a oggetti, tra cui **costruttori**, **metodi**, **incapsulamento**, **ereditarietà** e **override**.

---

## 📐 Esercizio 1: Classe Rettangolo

### Descrizione

Viene definita una classe `rettangolo` con due attributi: `base` e `altezza`. Il programma:

- Chiede all'utente di inserire la base e l'altezza tramite input da tastiera.
- Crea un oggetto `rettangolo`.
- Calcola e stampa **area** e **perimetro** usando metodi dedicati.

### File Coinvolti

- `main.java`
- `rettangolo.java`

---

## 🐾 Esercizio 2: Gerarchia di Classi con Ereditarietà

### Descrizione

Si crea una classe astratta `Animale` che viene estesa da due sottoclassi:

- `Cane`
- `Uccello`

Ogni sottoclasse definisce un comportamento specifico per il metodo `verso()`, sovrascrivendo quello base della classe `Animale`.

Il programma principale:

- Richiede all'utente nome e numero di zampe.
- Crea oggetti `Animale`, `Cane` e `Uccello`.
- Dimostra **costruttori sovraccarichi**, **override di metodi**, e **comportamenti specializzati**.

### File Coinvolti

- `main2/main.java`
- `main2/Animale.java`
- `main2/Cane.java`
- `main2/Uccello.java`

# Esercizio 3: Veicoli - Java

## Descrizione
Questo progetto implementa una classe `Veicolo` con attributi come "cavalli" e "sistema frenante". Inoltre, sono state create tre classi figlie: `Motociclo`, `Automobile`, e `Apecar`, ognuna delle quali estende la classe `Veicolo`.

Ogni classe implementa due metodi principali:

- **accelera()**: Stampa un messaggio in base alla potenza del motore (cavalli).
- **decelera()**: Stampa un messaggio in base al sistema frenante del veicolo.

Ogni veicolo ha un numero specifico di ruote e un comportamento di accelerazione e decelerazione personalizzato.

## Struttura del progetto

### Classe `Veicolo`
La classe base `Veicolo` contiene gli attributi comuni a tutti i veicoli:

- **cavalli**: La potenza del motore del veicolo.
- **sistemaFrenante**: L'efficacia del sistema frenante del veicolo.
- **marca**: La marca del veicolo.

Metodi:

- `accelera()`: Determina la velocità di accelerazione in base ai cavalli del motore.
- `decelera()`: Determina l'efficacia della frenata in base al sistema frenante.
- `caratteristiche()`: Stampa le caratteristiche del veicolo (cavalli, sistema frenante, marca).

### Classi derivate
Le classi derivate implementano i metodi `accelera()` e `decelera()` in modo specifico per il tipo di veicolo:

#### Classe `Apecar`
- **Attributo**: `ruote` (sempre 3 per un'Apecar).
- Il metodo `accelera()` è personalizzato per l'Apecar, in base alla potenza del motore.
- Il metodo `decelera()` è personalizzato in base al sistema frenante.

#### Classe `Automobile`
- **Attributo**: `ruote` (sempre 4 per un'automobile).
- I metodi `accelera()` e `decelera()` sono implementati per le automobili.

#### Classe `Motociclo`
- **Attributo**: `ruote` (sempre 2 per un motociclo).
- I metodi `accelera()` e `decelera()` sono implementati per i motocicli.

### Classe `main`
La classe `main` fornisce un'interfaccia utente per inserire i dati relativi ai veicoli, creando istanze di `Veicolo` e delle sue classi derivate. Viene testato il comportamento dei metodi `accelera()` e `decelera()` per ogni tipo di veicolo.

## Funzionalità
- Ogni veicolo può essere configurato con cavalli, sistema frenante e marca.
- I metodi `accelera()` e `decelera()` rispondono ai parametri specifici di ogni veicolo, producendo messaggi personalizzati.
- Le classi figlie sovrascrivono i metodi della classe base per implementare un comportamento specifico in base al tipo di veicolo.




