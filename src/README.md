# Loginsystem

## Hvordan fungerer programmet?

Programmet bruger to arrays:
- Ét array indeholder brugernavnene.
- Ét array indeholder de tilhørende adgangskoder.

Når brugeren forsøger at logge ind, sker følgende:

- Brugeren indtaster sit brugernavn.
- Programmet søger efter brugernavnet i username-arrayet.
- Hvis brugernavnet findes, returnerer metoden brugerens position (index) i arrayet.
- Programmets anden metode bruger denne position til at finde den tilhørende adgangskode i password-arrayet.
- Den indtastede adgangskode bliver sammenlignet med adgangskoden på samme position.
- Hvis oplysningerne er korrekte, får brugeren besked om, at login lykkedes.
- Hvis oplysningerne er forkerte, får brugeren besked om dette, og programmet holder styr på antallet af forsøg.

Programmets opbygning.

Programmet gør primært brug af:

- Arrays – til at gemme brugernavne og adgangskoder.
- Metoder – til at søge efter brugernavne og kontrollere adgangskoder.
- For-loops – til at gennemgå arrays og holde styr på login-forsøg.
- If-statements – til at kontrollere, om brugernavn og adgangskode er korrekte.
- Scanner – til at modtage brugerens input.

Udfordringer:
en af udfordringerne vi havde var at navngive vores metoder og variabler passende, vi løb ind i flere gange at det var svært ved at finde et passende navn der både var kort, gav mening og beskrev godt nok.

Gruppemedlemmer:
- Niklas
- Mark
- Sarah
