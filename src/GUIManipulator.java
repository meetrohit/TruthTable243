public final class GUIManipulator {

    static Boolean[] pvars = new Boolean[16];
    static Boolean[] qvars = new Boolean[16];
    static Boolean[] rvars = new Boolean[16];
    static Boolean[] tvars = new Boolean[16];
    static Boolean[] Avars = new Boolean[16];
    static Boolean[] Bvars = new Boolean[16];
    static Boolean[] Cvars = new Boolean[16];
    static Boolean[] Dvars = new Boolean[16];
    static Boolean[] Evars = new Boolean[16];
    static Boolean[] Fvars = new Boolean[16];
    static Boolean[][] varArray = {pvars, qvars, rvars, tvars};
    static Boolean[][] areaArray = {Avars, Bvars, Cvars, Dvars, Evars, Fvars};

    private GUIManipulator() {
    }

    public static String[] initialize(int selected) {
        int numPopulate = (int) Math.pow(2, selected);
        for (int i = 0; i <= selected - 1; i++) {
            Boolean[] vars = new Boolean[16];
            for (int j = 0; j < numPopulate; j++) {
                vars[j] = Math.floor(j / Math.pow(2, (selected - 1) - i)) % 2 == 0;
            }
            switch (i) {
                case 0:
                    System.arraycopy(vars, 0, pvars, 0, vars.length);
                    break;
                case 1:
                    System.arraycopy(vars, 0, qvars, 0, vars.length);
                    break;
                case 2:
                    System.arraycopy(vars, 0, rvars, 0, vars.length);
                    break;
                case 3:
                    System.arraycopy(vars, 0, tvars, 0, vars.length);
                    break;
            }
        }
        String output[] = new String[4];
        for (int i = 0; i < selected; i++) {
            Boolean[] arr = varArray[i];
            output[i] = "";
            for (int j = 0; j < numPopulate; j++) {
                try {
                    output[i] += arr[j].toString().toUpperCase().charAt(0) + "\n";
                } catch (java.lang.NullPointerException e) {
                }
            }
        }
        return output;
    }

    public static Boolean[] getArray(String name)
    {
        Boolean[] retArray = new Boolean[16];
        switch(name)
        {
            case "p":
                System.arraycopy(pvars,0,retArray,0,retArray.length);
                break;
            case "q":
                System.arraycopy(qvars,0,retArray,0,retArray.length);
                break;
            case "r":
                System.arraycopy(rvars,0,retArray,0,retArray.length);
                break;
            case "t":
                System.arraycopy(tvars,0,retArray,0,retArray.length);
                break;
            case "A":
                System.arraycopy(Avars,0,retArray,0,retArray.length);
                break;
            case "B":
                System.arraycopy(Bvars,0,retArray,0,retArray.length);
                break;
            case "C":
                System.arraycopy(Cvars,0,retArray,0,retArray.length);
                break;
            case "D":
                System.arraycopy(Dvars,0,retArray,0,retArray.length);
                break;
            case "E":
                System.arraycopy(Evars,0,retArray,0,retArray.length);
                break;
        }
        return retArray;
    }

    public static String Compute(String panel, String op, Boolean[] left, Boolean[] right, int selected) {
        Boolean[] ret = new Boolean[16];
        int numPopulate = (int) Math.pow(2, selected);
        try {
            switch (op) {
                case "AND":
                    for (int i = 0; i < numPopulate; i++) {
                        ret[i] = left[i] & right[i];
                    }
                    break;
                case "OR":
                    for (int i = 0; i < numPopulate; i++) {
                        ret[i] = left[i] | right[i];
                    }
                    break;
                case "XOR":
                    for (int i = 0; i < numPopulate; i++) {
                        ret[i] = left[i] ^ right[i];
                    }
                    break;
                case "NOT":
                    for (int i = 0; i < numPopulate; i++) {
                        ret[i] = !left[i];
                    }
                    break;
                case "NAND":
                    for (int i = 0; i < numPopulate; i++) {
                        ret[i] = !(left[i] & right[i]);
                    }
                    break;
                case "NOR":
                    for (int i = 0; i < numPopulate; i++) {
                        ret[i] = !(left[i] | right[i]);
                    }
                    break;
            }
        }
        catch(java.lang.NullPointerException e)
        {
            return "";
        }

        switch(panel)
        {
            case "A":
                System.arraycopy(ret,0,Avars,0,ret.length);
                break;
            case "B":
                System.arraycopy(ret,0,Bvars,0,ret.length);
                break;
            case "C":
                System.arraycopy(ret,0,Cvars,0,ret.length);
                break;
            case "D":
                System.arraycopy(ret,0,Dvars,0,ret.length);
                break;
            case "E":
                System.arraycopy(ret,0,Evars,0,ret.length);
                break;
        }

        String output = "";
        for (int j = 0; j < numPopulate; j++) {
            try {
                output += ret[j].toString().toUpperCase().charAt(0) + "\n";
            } catch (java.lang.NullPointerException e) {
            }
        }
        return output;
    }
}