# Sorting Program
- Author:  Anawat Jandee
- Student ID:  672115049<br><br>
A Programming Assignment in ADT & Solving Problem course that reads student data from a CSV file and provides functionality to sort and search student names.
---

## Description
This project allows users to sort student records by:
- ID
- First name
- Last name
- It also provides functionality to search for a student by their first name and retrieve the index where the name is located in the data.



## Table of Contents
- [Installation](#installation)
- [Usage and Output](#usage-and-output)
- [Features](#features)

## Installation
1. Save the source code in a file named `Sorting.java`.
2. Prepare a `students.csv` file with student data. Ensure the data follows the correct format (e.g., `ID,First Name,Last Name`).
3. Compile the Java program:
   ```bash
   javac Sorting.java
   ```

## Usage and Output
To use the program, follow these steps:

1. Run the program in your terminal.
2. The program will display options for sorting and searching:
   - `-n`: Sort by student ID.
   - `-f`: Sort by first name.
   - `-l`: Sort by last name.
   - `-s`: Search for a student by first name.

3. Enter the desired option (e.g., `-n` to sort by ID).
4. For the search option (`-s`), enter the student's first name when prompted.

Example interaction
```bash
Choose -n for sort by ID

622115040 SUCHANUN SIRIJANYA
662115007 CHONCHANUN KHACHONPHURITHANAKUL
662115016 NATTHAPHUM CHAIKHAN
662115039 MANAPAT KAEWLAI
672115001 KATIKA KANTHASON
672115002 KRITTAMETH TANSUWAN
672115004 JITTIPAT KAEWIJIT
672115005 CHETSADA KANKARN
672115006 CHANLACHAT PANYOYAI
672115007 CHANCHAKORN JULLAPECH
672115008 CHANYA BUNRUEANG
672115009 CHIDNUCHA POBKEEREE
672115010 NATANON SOMBOON
672115011 NATTHAPOOM SAENGKAEW
672115012 NUT SUPAPORN
672115013 NATTHAN CHAMPATHIP
672115014 NATTIKORN SAE-SUE
672115015 NATTAPON SUKKEAW
672115016 NATTHAPAT JAGKHURUANG
672115018 DALANPHOP KEAWSIRIPONG
672115019 THINNAPOP SRISOMBOON
672115020 TECHIT WONGKITI
672115024 TAT PUTJORN
672115028 NINA BURGER
672115037 PHUTAWAN MUEANGMA
672115039 METAVEE AEINJANG
672115041 RAPHEEPHAT AEIPHINGCHAI
672115042 RANTICHA CHUMJAI
672115043 WASINPAT YANIN
672115044 VIDCHAYADA ABHICHARTTIBUTRA
672115045 VIRAWIT KONGTHONG
672115046 SATTAPORN KOWARAKUN
672115047 SAMAKOM MAKHIAO
672115048 SUKRITPONG WONGPANYA
672115049 ANAWAT JANDEE
```
```bash
Choose -f for sort by First name

672115049 ANAWAT JANDEE
672115007 CHANCHAKORN JULLAPECH
672115006 CHANLACHAT PANYOYAI
672115008 CHANYA BUNRUEANG
672115005 CHETSADA KANKARN
672115009 CHIDNUCHA POBKEEREE
662115007 CHONCHANUN KHACHONPHURITHANAKUL
672115018 DALANPHOP KEAWSIRIPONG
672115004 JITTIPAT KAEWIJIT
672115001 KATIKA KANTHASON
672115002 KRITTAMETH TANSUWAN
662115039 MANAPAT KAEWLAI
672115039 METAVEE AEINJANG
672115010 NATANON SOMBOON
672115015 NATTAPON SUKKEAW
672115013 NATTHAN CHAMPATHIP
672115016 NATTHAPAT JAGKHURUANG
662115016 NATTHAPHUM CHAIKHAN
672115011 NATTHAPOOM SAENGKAEW
672115014 NATTIKORN SAE-SUE
672115028 NINA BURGER
672115012 NUT SUPAPORN
672115037 PHUTAWAN MUEANGMA
672115042 RANTICHA CHUMJAI
672115041 RAPHEEPHAT AEIPHINGCHAI
672115047 SAMAKOM MAKHIAO
672115046 SATTAPORN KOWARAKUN
622115040 SUCHANUN SIRIJANYA
672115048 SUKRITPONG WONGPANYA
672115024 TAT PUTJORN
672115020 TECHIT WONGKITI
672115019 THINNAPOP SRISOMBOON
672115044 VIDCHAYADA ABHICHARTTIBUTRA
672115045 VIRAWIT KONGTHONG
672115043 WASINPAT YANIN
```
```bash
Choose -l for sort by Last name

672115044 VIDCHAYADA ABHICHARTTIBUTRA
672115039 METAVEE AEINJANG
672115041 RAPHEEPHAT AEIPHINGCHAI
672115008 CHANYA BUNRUEANG
672115028 NINA BURGER
662115016 NATTHAPHUM CHAIKHAN
672115013 NATTHAN CHAMPATHIP
672115042 RANTICHA CHUMJAI
672115016 NATTHAPAT JAGKHURUANG
672115049 ANAWAT JANDEE
672115007 CHANCHAKORN JULLAPECH
672115004 JITTIPAT KAEWIJIT
662115039 MANAPAT KAEWLAI
672115005 CHETSADA KANKARN
672115001 KATIKA KANTHASON
672115018 DALANPHOP KEAWSIRIPONG
662115007 CHONCHANUN KHACHONPHURITHANAKUL
672115045 VIRAWIT KONGTHONG
672115046 SATTAPORN KOWARAKUN
672115047 SAMAKOM MAKHIAO
672115037 PHUTAWAN MUEANGMA
672115006 CHANLACHAT PANYOYAI
672115009 CHIDNUCHA POBKEEREE
672115024 TAT PUTJORN
672115014 NATTIKORN SAE-SUE
672115011 NATTHAPOOM SAENGKAEW
622115040 SUCHANUN SIRIJANYA
672115010 NATANON SOMBOON
672115019 THINNAPOP SRISOMBOON
672115015 NATTAPON SUKKEAW
672115012 NUT SUPAPORN
672115002 KRITTAMETH TANSUWAN
672115020 TECHIT WONGKITI
672115048 SUKRITPONG WONGPANYA
672115043 WASINPAT YANIN
```
```bash
Choose -s for sort by Search Student
Fill name for find index: ANAWAT

Find at index: 34
```

---

## Features
- **Sorting Options**: Allows sorting student data by:
  - ID
  - First Name
  - Last Name
- **Search Functionality**: Search for a student by their first name and retrieve the index of their record.
- **CSV Integration**: Reads student data from a CSV file for easy integration and testing.
- **User-Friendly Console Interaction**: Provides clear prompts and outputs for user actions.
- **Customizable Sorting Logic**: Demonstrates bubble sort for sorting, which can be modified for different algorithms.


# THANK YOU
---
