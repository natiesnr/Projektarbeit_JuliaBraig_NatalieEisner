# Programmiertechnik Projekt – IMUK Studienplaner - Pass The Test

Julia Braig Matrikel-Nr 387716


Natalie Eisner Matrikel-Nr 398886


## Projektbeschreibung
Das Projekt ist ein digitaler Planer speziell für den Studiengang **IMUK**. Die Anwendung soll Studierenden helfen, ihre Module, Aufgaben, Termine und Noten übersichtlich an einem Ort zu verwalten. Die Benutzeroberfläche orientiert sich dabei an den grundlegenden Funktionen von Moodle – jedoch in einer vereinfachten und übersichtlichen Form.


---

### **1. Fächer- und Modulübersicht**

Alle IMUK-Module werden übersichtlich angezeigt. Studierende können ein Modul auswählen und gelangen zur Detailansicht. Dort lassen sich Aufgaben einsehen, hinzufügen und als *erledigt* oder *offen* markieren. 
Zentraler Punkt zur Strukturierung des Studiums.

---

### **2. Aufgabenverwaltung**

Alle Aufgaben eines gewählten Moduls werden angezeigt. Nutzer können:

* Aufgaben erstellen
* Aufgabenstatus ändern (offen/erledigt)
* Aufgaben bearbeiten oder löschen

So behalten Studierende ihre To-dos stets im Blick.

---

### **3. Wochenplan-Terminverwaltung**

Studierende können Termine direkt in einer Wochenplanstruktur eintragen. Jeder Wochentag (Montag–Freitag/Samstag/Sonntag) hat einen eigenen Bereich für:

* Vorlesungen
* Abgabefristen
* Prüfungen
* sonstige wichtige Termine

Damit entsteht eine klare Wochenübersicht und eine strukturierte Planung.

---

### **4. Notenverwaltung**
- Noten für jedes Modul eintragbar
- Eingabevalidierung:
  - nur erlaubte Werte → **1 bis 5**
  - bei falscher Eingabe erscheint eine **Fehlermeldung**
- Optional: automatische Berechnung von Durchschnittsnoten


---

### **5. Navigationsstruktur zwischen den GUI-Ansichten**

Die Java-GUI besteht aus mehreren Ansichten, die per Buttons verbunden sind:

* **Fächerauswahl → Aufgaben & Module**
* **Module → Wochenplan/Termine**
* **Module/Termine → Notenverwaltung**

Dies schafft einen intuitiven Workflow, ähnlich einem realen Organizer.

---

### **6. Datenvalidierung & Fehlermeldungen**

Eingaben in allen Bereichen (z. B. Noten, Termine) werden überprüft. Fehlerhafte Eingaben erzeugen klare Fehlermeldungen, sodass die Daten korrekt bleiben.

---

## Verwendete Technologien
- Java
- Swing GUI
- Git (Versionierung)


## Installation & Nutzung

```bash
1. Repository klonen
git clone https://github.com/natiesnr/Projektarbeit_JuliaBraig_NatalieEisner.git

2. Projekt in der IDE öffnen

3. Hauptklasse ausführen








