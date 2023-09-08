import java.util.*; //imports the scanner class files

public class Main {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        Main ob = new Main();
        String symbol, subshell;
        double sigma;
        char ch = 'Y';
        
        ob.printDetails();
        
        while(ch == 'Y' || ch == 'y') {
            System.out.print("Enter symbol of element : ");
        symbol = in.next();
        System.out.println();

        switch (symbol) {
            case "H":
                System.out.println("Element name : Hydrogen");
                System.out.println("Symbol : H");
                System.out.println("Atomic number : 1");
                System.out.println("Electronic configuration : (1s1)");
                System.out.println("Enter one of the subshell - {1s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 1);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (1 - sigma));
                break;

            case "He":
                System.out.println("Element name : Helium");
                System.out.println("Symbol : He");
                System.out.println("Atomic number : 2");
                System.out.println("Electronic configuration : (1s2)");
                System.out.println("Enter one of the subshell - {1s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 2);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (2 - sigma));
                break;

            case "Li":
                System.out.println("Element name : Lithium");
                System.out.println("Symbol : Li");
                System.out.println("Atomic number : 3");
                System.out.println("Electronic configuration : (1s2) (2s1)");
                System.out.println("Enter one of the subshell - {1s, 2s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 3);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (3 - sigma));
                break;

            case "Be":
                System.out.println("Element name : Berylium");
                System.out.println("Symbol : Be");
                System.out.println("Atomic number : 4");
                System.out.println("Electronic configuration : (1s2) (2s2)");
                System.out.println("Enter one of the subshell - {1s, 2s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 4);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (4 - sigma));
                break;

            case "B":
                System.out.println("Element name : Boron");
                System.out.println("Symbol : B");
                System.out.println("Atomic number : 5");
                System.out.println("Electronic configuration : (1s2) (2s2 2p1)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 5);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (5 - sigma));
                break;

            case "C":
                System.out.println("Element name : Carbon");
                System.out.println("Symbol : C");
                System.out.println("Atomic number : 6");
                System.out.println("Electronic configuration : (1s2) (2s2 2p2)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 6);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (6 - sigma));
                break;

            case "N":
                System.out.println("Element name : Nitrogen");
                System.out.println("Symbol : N");
                System.out.println("Atomic number : 7");
                System.out.println("Electronic configuration : (1s2) (2s2 2p3)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 7);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (7 - sigma));
                break;

            case "O":
                System.out.println("Element name : Oxygen");
                System.out.println("Symbol : O");
                System.out.println("Atomic number : 8");
                System.out.println("Electronic configuration : (1s2) (2s2 2p4)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 8);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (8 - sigma));
                break;

            case "F":
                System.out.println("Element name : Flourine");
                System.out.println("Symbol : F");
                System.out.println("Atomic number : 9");
                System.out.println("Electronic configuration : (1s2) (2s2 2p5)");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 9);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (9 - sigma));
                break;

            case "Ne":
                System.out.println("Element name : Neon");
                System.out.println("Symbol : Ne");
                System.out.println("Atomic number : 10");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 10);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (10 - sigma));
                break;

            case "Na":
                System.out.println("Element name : Sodium");
                System.out.println("Symbol : Na");
                System.out.println("Atomic number : 11");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s1)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 11);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (11 - sigma));
                break;

            case "Mg":
                System.out.println("Element name : Magnesium");
                System.out.println("Symbol : Mg");
                System.out.println("Atomic number : 12");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 12);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (12 - sigma));
                break;

            case "Al":
                System.out.println("Element name : Aluminium");
                System.out.println("Symbol : Al");
                System.out.println("Atomic number : 13");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p1)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 13);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (13 - sigma));
                break;

            case "Si":
                System.out.println("Element name : Silicon");
                System.out.println("Symbol : Si");
                System.out.println("Atomic number : 14");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p2)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 14);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (14 - sigma));
                break;

            case "P":
                System.out.println("Element name : Phosphorus");
                System.out.println("Symbol : P");
                System.out.println("Atomic number : 15");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p3)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 15);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (15 - sigma));
                break;

            case "S":
                System.out.println("Element name : Sulphur");
                System.out.println("Symbol : S");
                System.out.println("Atomic number : 16");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p4)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 16);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (16 - sigma));
                break;

            case "Cl":
                System.out.println("Element name : Chlorine");
                System.out.println("Symbol : Cl");
                System.out.println("Atomic number : 17");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p5)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 17);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (17 - sigma));
                break;

            case "Ar":
                System.out.println("Element name : Argon");
                System.out.println("Symbol : Ar");
                System.out.println("Atomic number : 18");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p6)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 18);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (18 - sigma));
                break;

            case "K":
                System.out.println("Element name : Potassium");
                System.out.println("Symbol : K");
                System.out.println("Atomic number : 19");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p6) (4s1)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p, 4s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 19);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (19 - sigma));
                break;

            case "Ca":
                System.out.println("Element name : Calsium");
                System.out.println("Symbol : Ca");
                System.out.println("Atomic number : 20");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p6) (4s2)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p, 4s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 20);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (20 - sigma));
                break;

            case "Sc":
                System.out.println("Element name : Scandium");
                System.out.println("Symbol : Sc");
                System.out.println("Atomic number : 21");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p6) (3d1) (4s2)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p, 3d, 4s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 21);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (21 - sigma));
                break;

            case "Ti":
                System.out.println("Element name : Titanium");
                System.out.println("Symbol : Ti");
                System.out.println("Atomic number : 22");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p6) (3d2) (4s2)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p, 3d, 4s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 22);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (22 - sigma));
                break;

            case "V":
                System.out.println("Element name : Vanadium");
                System.out.println("Symbol : V");
                System.out.println("Atomic number : 23");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p6) (3d3) (4s2)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p, 3d, 4s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 23);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (23 - sigma));
                break;

            case "Cr":
                System.out.println("Element name : Chromium");
                System.out.println("Symbol : Cr");
                System.out.println("Atomic number : 24");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p6) (3d5) (4s1)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p, 3d, 4s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 24);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (24 - sigma));
                break;

            case "Mn":
                System.out.println("Element name : Manganese");
                System.out.println("Symbol : Mn");
                System.out.println("Atomic number : 25");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p6) (3d5) (4s2)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p, 3d, 4s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 25);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (25 - sigma));
                break;

            case "Fe":
                System.out.println("Element name : Iron");
                System.out.println("Symbol : Fe");
                System.out.println("Atomic number : 26");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p6) (3d6) (4s2)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p, 3d, 4s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 26);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (26 - sigma));
                break;

            case "Co":
                System.out.println("Element name : Cobalt");
                System.out.println("Symbol : Co");
                System.out.println("Atomic number : 27");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p6) (3d7) (4s2)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p, 3d, 4s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 27);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (27 - sigma));
                break;

            case "Ni":
                System.out.println("Element name : Nickel");
                System.out.println("Symbol : Ni");
                System.out.println("Atomic number : 28");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p6) (3d8) (4s2)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p, 3d, 4s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 28);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (28 - sigma));
                break;

            case "Cu":
                System.out.println("Element name : Copper");
                System.out.println("Symbol : Cu");
                System.out.println("Atomic number : 29");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p6) (3d10) (4s1)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p, 3d, 4s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 29);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (29 - sigma));
                break;

            case "Zn":
                System.out.println("Element name : Zinc");
                System.out.println("Symbol : Zn");
                System.out.println("Atomic number : 30");
                System.out.println("Electronic configuration : (1s2) (2s2 2p6) (3s2 3p6) (3d10) (4s2)");
                System.out.println("Enter one of the subshell - {1s, 2s, 2p, 3s, 3p, 3d, 4s}");
                subshell = in.next();
                sigma = ob.calculateSigma(subshell, 30);
                System.out.println("Sigma = " + sigma);
                System.out.println("Zeff = Z - Sigma = " + (30 - sigma));
                break;

            default:
                System.out.println("Invalid!");
        }
        
        System.out.println("\nDo you want to continue? (Y/N)");
        ch = in.next().charAt(0);
        System.out.print("\n");
        }
    }

    double calculateSigma(String subshell, int atomicNumber) {
        if (subshell.equalsIgnoreCase("1s")) { //if 1s subshell is asked
            if(atomicNumber == 1)
            return 0.0;
            else
            return 0.3;
        }
        
        else { //if other subshells are asked
        
            double sigma;
            int nElectrons = countElectrons(subshell, atomicNumber);
            if (subshell.equalsIgnoreCase("2s") || subshell.equalsIgnoreCase("2p"))
                sigma = (2 * 0.85) + (nElectrons * 0.35); //for 2s and 2p
            else if (subshell.equalsIgnoreCase("3s") || subshell.equalsIgnoreCase("3p"))
                sigma = (2 * 1.00) + (8 * 0.85) + (nElectrons * 0.35); //for 3s and 3p
            else { //for 3d and 4s
                if (atomicNumber >= 19 && atomicNumber <= 20)
                    sigma = (10 * 1.00) + (8 * 0.85) + (nElectrons * 0.35);
                else if (atomicNumber >= 21 && atomicNumber <= 23) {
                    if (subshell.equalsIgnoreCase("3d")) {
                        sigma = (18 * 1.00) + (nElectrons * 0.35);
                    } else {
                        if (atomicNumber == 21)
                            sigma = (10 * 1.00) + (9 * 0.85) + (nElectrons * 0.35);
                        else if (atomicNumber == 22)
                            sigma = (10 * 1.00) + (10 * 0.85) + (nElectrons * 0.35);
                        else
                            sigma = (10 * 1.00) + (11 * 0.85) + (nElectrons * 0.35);
                    }
                } else if (atomicNumber == 24) {
                    if (subshell.equalsIgnoreCase("3d"))
                        sigma = (18 * 1.00) + (nElectrons * 0.35);
                    else
                        sigma = (10 * 1.00) + (13 * 0.85) + (nElectrons * 0.35);
                } else if (atomicNumber >= 25 && atomicNumber <= 28) {
                    if (subshell.equalsIgnoreCase("3d"))
                        sigma = (18 * 1.00) + (nElectrons * 0.35);
                    else {
                        if (atomicNumber == 25)
                            sigma = (10 * 1.00) + (13 * 0.85) + (nElectrons * 0.35);
                        else if (atomicNumber == 26)
                            sigma = (10 * 1.00) + (14 * 0.85) + (nElectrons * 0.35);
                        else if (atomicNumber == 27)
                            sigma = (10 * 1.00) + (15 * 0.85) + (nElectrons * 0.35);
                        else
                            sigma = (10 * 1.00) + (16 * 0.85) + (nElectrons * 0.35);
                    }
                } else {
                    if (subshell.equalsIgnoreCase("3d"))
                        sigma = (18 * 1.00) + (nElectrons * 0.35);
                    else
                        sigma = (10 * 1.00) + (18 * 0.85) + (nElectrons * 0.35);
                }
            }
            return sigma;
        }
    }

    int countElectrons(String subshell, int atomicNumber) {
        int n = 0;
        if (atomicNumber == 3) { //2s1
            n = 0;
        } else if (atomicNumber == 4) { //2s2
            n = 1;
        } else if (atomicNumber == 5) { //2s2 2p1
            n = 2;
        } else if (atomicNumber == 6) { //2s2 2p2
            n = 3;
        } else if (atomicNumber == 7) { 
            n = 4;
        } else if (atomicNumber == 8) {
            n = 5;
        } else if (atomicNumber == 9) { //2s2 2p5
            n = 6;
        } else if (atomicNumber == 10) { //2s2 2p6
            n = 7;
        } else if (atomicNumber >= 11 && atomicNumber <= 18) {
            if (subshell.equalsIgnoreCase("2s") || subshell.equalsIgnoreCase("2p"))
                n = 7;
            else {
                if (atomicNumber == 11)
                    n = 0;
                if (atomicNumber == 12)
                    n = 1;
                if (atomicNumber == 13)
                    n = 2;
                if (atomicNumber == 14)
                    n = 3;
                if (atomicNumber == 15)
                    n = 4;
                if (atomicNumber == 16)
                    n = 5;
                if (atomicNumber == 17)
                    n = 6;
                if (atomicNumber == 18)
                    n = 7;
            }
        } else if (atomicNumber >= 19 && atomicNumber <= 20) {
            if (subshell.equalsIgnoreCase("2s") || subshell.equalsIgnoreCase("2p"))
                n = 7;
            else if (subshell.equalsIgnoreCase("3s") || subshell.equalsIgnoreCase("3p"))
                n = 7;
            else {
                if (atomicNumber == 19)
                    n = 0;
                else
                    n = 1;
            }
        } else if (atomicNumber >= 21 && atomicNumber <= 23) {
            if (subshell.equalsIgnoreCase("2s") || subshell.equalsIgnoreCase("2p"))
                n = 7;
            else if (subshell.equalsIgnoreCase("3s") || subshell.equalsIgnoreCase("3p"))
                n = 7;
            else if (subshell.equalsIgnoreCase("4s"))
                n = 1;
            else {
                if (atomicNumber == 21)
                    n = 0;
                if (atomicNumber == 22)
                    n = 1;
                else
                    n = 2;
            }
        } else if (atomicNumber == 24) {
            if (subshell.equalsIgnoreCase("2s") || subshell.equalsIgnoreCase("2p"))
                n = 7;
            else if (subshell.equalsIgnoreCase("3s") || subshell.equalsIgnoreCase("3p"))
                n = 7;
            else if (subshell.equalsIgnoreCase("4s"))
                n = 0;
            else
                n = 4;
        } else if (atomicNumber >= 25 && atomicNumber <= 28) {
            if (subshell.equalsIgnoreCase("2s") || subshell.equalsIgnoreCase("2p"))
                n = 7;
            else if (subshell.equalsIgnoreCase("3s") || subshell.equalsIgnoreCase("3p"))
                n = 7;
            else if (subshell.equalsIgnoreCase("4s"))
                n = 1;
            else {
                if (atomicNumber == 25)
                    n = 4;
                if (atomicNumber == 26)
                    n = 5;
                if (atomicNumber == 27)
                    n = 6;
                else
                    n = 7;
            }
        } else if (atomicNumber == 29) {
            if (subshell.equalsIgnoreCase("2s") || subshell.equalsIgnoreCase("2p"))
                n = 7;
            else if (subshell.equalsIgnoreCase("3s") || subshell.equalsIgnoreCase("3p"))
                n = 7;
            else if (subshell.equalsIgnoreCase("4s"))
                n = 0;
            else
                n = 9;
        } else {
            if (subshell.equalsIgnoreCase("2s") || subshell.equalsIgnoreCase("2p"))
                n = 7;
            else if (subshell.equalsIgnoreCase("3s") || subshell.equalsIgnoreCase("3p"))
                n = 7;
            else if (subshell.equalsIgnoreCase("4s"))
                n = 1;
            else
                n = 9;
        }

        return n;
    }
    
    void printDetails() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("FY BTech 2022-23\n");
        
        
        System.out.println("Project on Slaters Rule by :\n");
        System.out.println("Shivam Pokharkar");
        System.out.println("Srivaths Iyer");
        System.out.println("Devansh Dyag");
        
        System.out.println("-------------------------------------------------------------------\n");
    }
}
