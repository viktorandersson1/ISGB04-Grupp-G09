Extern designspecifikation – Träningsloggen (G09)
Version 1.0, 2026-11-20. Lab 2 del C. Från designer-AI:n (chat gpt) på uppdrag från TPL. Granskas och godkänns av gruppens produktägare (PO). Underlag för K6 (AK6.4).
1. Gränssnittstyp och målgrupp
Programmet har ett textbaserat gränssnitt (CLI) med en meny på svenska. Den används av tränaren i Klarälvsloppet IK för att hantera medlemmar , mål och träningspass.
2. Flöde
Start → Huvudmeny
         1. Lägg till medlem
         2. Hantera mål
         3. Registrera pass
         4. Visa en medlems pass
         5. Visa veckosammanställning
         6. Spara
         7. Öppna
         8. Avsluta
Efter varje operation återgår användaren till huvudmenyn, förutom vid avslut.
3. En vy per operation (K6)
Operation	Vy (textskiss)	Indata som efterfrågas	Utdata	Felmeddelanden
Lägg till medlem	Lägg till medlem	Namn, träningsgrupp	Medlemmen har lagts till.	Namnet finns redan
Hantera mål	1. Skapa mål 2. Uppnått 3. Avbryt mål	Medlem, mål, aktivitetstyp, beskrivning, slutdatum eller statusval	Mål och status	Mål går inte testa igen
Registrera pass	Registrera pass	Medlem, datum, aktivitet, mätvärden och kommentar	Registrerat pass och nyckeltal	Medlem finns inte,felaktig datum, pass under 5 km
Visa en medlems pass	Datum / Aktivitet / Nyckeltal	Medlem	Lista över pass med mätvärden och kommentarer	Medlemmen finns inte
Visa veckosammanställning	Vecka / Antal / Summa / Bästa pass / Personligt bästa	Medlem, vecka	Sammanställning enligt K4	Medlemmen finns inte
Spara	Spara – Filnamn:	Filnamn	”Uppgifterna har sparats.”	Fil kunde inte sparas
Öppna	Öppna – Filnamn:	Filnamn	”Uppgifterna har öppnats.”	Fil kunde inte öppnas
Avsluta	Vill du avsluta? (J/N)	J eller N	Avslutar eller återgår till menyn	Ogiltig bekräftelse
Vid registrering av pass anges distans och tid för löpning/cyklande sets, repetitioner och vikt för styrkan.
4. Texter och felmeddelanden
Rubriker och ledtexter: ”Träningsloggen”, ”Lägg till medlem”, ”hantera mål”, ”Registrera”, ”Visa en medlemspass” veckosammanställning”, ”Spara”, ”Öppna”, ”Avsluta”, ”Välj alternativ:”, ”Ange namn:”, ”Ange filnamn:” och ”Vill du avsluta? (J/N)”.
Felmeddelanden:
”fel: Ogiltigt val välj ett alternativ i menyn.”
”fel: Cykelpass måste vara minst 5 km ange en distans på minst 5 km.”
”fel: Datum är fel format använd ÅÅÅÅ-MM-DD.”
”fel: Medlemmen finns inte välj en registrerad medlem.”
”fel: Ange J eller N.”
”fel: går inte testa igen.”
”fel: namnet finns redan”
Om inga pass finns visas ”Inga pass registrerade.”
5. Motivering mot gränssnittsprinciperna (F4, Coad & Yourdon)
Princip	Hur designen uppfyller den
Ångra / avbryta utan skada	Användaren kan avbryta en inmatning utan att ändringarna sparas.
Inget ”mänskligt RAM”	Menyn visar alla alternativ så användaren slipper memorisera dom
Inlärning	Tydliga instruktioner och liknande menyer gör programmet lättare att lära sig.
Konsekvent look and feel	Samma upplägg språk och felhantering används i alla vyer.
6. Designrundor
Runda	Uppdrag från TPL (sammandrag)	PO:s granskning – vad som avvisades	Ändring
1	Ta fram meny, åtta vyer och felmeddelanden.	Otydliga vyer och felmeddelanden identifierades vid granskningen.	Vyer och felmeddelanden förtydligades och förbättrades.
2	Förbättra designen enligt återkopplingen.	Mindre stavfel och formuleringar som behövde rättas.	Felen rättades och förbättrades.


Designrundorna dokumenterade i AI-loggen.
7. Avvikelser vid implementation (fylls i under Lab 3)
Vy	Avvikelse från designen	Motivering (designbeslut)
–	Fylls i under Lab 3	–