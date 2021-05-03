# Ferrari Låneberegner

## Krav:

- [ ] Letforståelige, intuitive interfaces.
- [ ] Hurtig feedback på handlinger i brugergrænsefladen. Brug af asynkrone og parallelle processer, hvor det er muligt (f.eks. ved kald til RKI og bank)
- [ ] Oplysninger skal persisteres i en database. Vi ønsker oplysninger om kunder, sælgere, biler og aftaler. Da kunders personnumre indgår, skal de behandles med diskretion. De må derfor ikke anvendes som nøgler noget sted.
- [ ] Systemet laves her og nu som en enkeltbrugerløsning, men ønskes på sigt flyttet til en web-platform. Den anvendte arkitektur bør tage hensyn til dette. 
- [ ] Systemet skal kunne eksportere en CSV-fil med en oversigt over lånetilbuddet, herunder tilbagebetalingsplan.
- [ ] Funktionen til fastsættelseaf rentesats skal være af særlig høj kvalitet fordi fejl i denne funktion kan medføre væsentlige omkostninger enten i form af tabt forretning (hvis renten er for høj) eller øget risiko (hvis renten er for lav)

### Info:

- Java 16
- JavaFX
- JUnit tests
- Microsoft SQL 2019 Express (Windows Authentication) [3NF]
- VCS (GitHub)
- CI/CD