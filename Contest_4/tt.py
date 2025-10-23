class Sangrahak:
    def __init__(self, seema):
        self.jaankari = list(range(seema + 1))
    def khojo(self, bindu):
        if self.jaankari[bindu] != bindu:
            self.jaankari[bindu] = self.khojo(self.jaankari[bindu])
        return self.jaankari[bindu]
    def jodo(self, pratham, dwitiya):
        mool1 = self.khojo(pratham)
        mool2 = self.khojo(dwitiya)
        if mool1 == mool2:
            return False
        self.jaankari[mool2] = mool1
        return True
class Sanket:
    def __init__(self, aarambh, ant, sankhya):
        self.aage = aarambh
        self.peechhe = ant
        self.ank = sankhya
        self.tulna = ant - aarambh
def setuBanao(padhaai):
    kulrekha = int(padhaai())
    pulon = []
    sabseBada = 0
    for ganak in range(1, kulrekha + 1):
        peela = int(padhaai())
        hara = int(padhaai())
        pulon.append(Sanket(peela, hara, ganak))
        sabseBada = max(sabseBada, peela, hara)
    pulon.sort(key=lambda bandhan: -bandhan.tulna)
    ganana = Sangrahak(sabseBada)
    chayan = []
    for rassi in pulon:
        if ganana.jodo(rassi.aage, rassi.peechhe):
            chayan.append(rassi.ank)
    print(len(chayan))
    print(" ".join(map(str, chayan)))
def mukhya():
    import sys
    aankh = sys.stdin.read().split()
    dhaara = iter(aankh)
    ginti = int(next(dhaara))
    for _ in range(ginti):
        setuBanao(dhaara.__next__)
if __name__ == "__main__":
    mukhya()