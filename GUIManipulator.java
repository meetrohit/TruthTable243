public class GUIManipulator {

    Boolean[] pvars = new Boolean[16];
    Boolean[] qvars = new Boolean[16];
    Boolean[] rvars = new Boolean[16];
    Boolean[] tvars = new Boolean[16];
    Boolean[] Avars = new Boolean[16];
    Boolean[] Bvars = new Boolean[16];
    Boolean[] Cvars = new Boolean[16];
    Boolean[] Dvars = new Boolean[16];
    Boolean[] Evars = new Boolean[16];
    Boolean[] Fvars = new Boolean[16];
    Boolean[][] varArray = {pvars,qvars,rvars,tvars};
    Boolean[][] areaArray = {Avars,Bvars,Cvars,Dvars, Evars, Fvars};

    public GUIManipulator(TruthTableGUI ttg) {
        initialize(ttg);
    }

    public void initialize(TruthTableGUI ttg) {
        int selected = (int)ttg.getNumVarDrop().getItemAt(ttg.getNumVarDrop().getSelectedIndex());
        int numPopulate = (int)Math.pow(2, selected);
        for(int i = 0; i <= selected-1; i++) {
            Boolean[] vars = new Boolean[16];
            for(int j = 0; j < numPopulate; j++) {
                vars[j] = Math.floor( j / Math.pow( 2, ( selected - 1 ) - i )) % 2 == 0;
                System.out.println("vars[" + j + "] = " + (Math.floor( j / Math.pow( 2, ( selected - 1 ) - i )) % 2 == 0));
            }
            switch(i) {
                case 0:
                    System.arraycopy(vars,0,pvars,0,vars.length);
                    break;
                case 1:
                    System.arraycopy(vars,0,qvars,0,vars.length);
                    break;
                case 2:
                    System.arraycopy(vars,0,rvars,0,vars.length);
                    break;
                case 3:
                    System.arraycopy(vars,0,tvars,0,vars.length);
                    break;
            }
        }
        String output;
        int i = 0;
        for(Boolean[] arr : varArray) {
            output = "";
            for (int j = 0; j < numPopulate; j++) {
                try {
                    output += arr[j].toString().charAt(0) + "\n";
                }
                catch( java.lang.NullPointerException e) {}
            }
            switch (i) {
                case 0:
                    ttg.getPvarArea().setText(output.toUpperCase());
                    break;
                case 1:
                    ttg.getQvarArea().setText(output.toUpperCase());
                    break;
                case 2:
                    ttg.getRvarArea().setText(output.toUpperCase());
                    break;
                case 3:
                    ttg.getTvarArea().setText(output.toUpperCase());
                    break;
            }
            i++;
        }
    }

    public void WriteAll(TruthTableGUI ttg) {
        int selected = (int)ttg.getNumVarDrop().getItemAt(ttg.getNumVarDrop().getSelectedIndex());
        int numPopulate = (int)Math.pow(2, selected);
        String output;
        int i = 0;
        for(Boolean[] arr : areaArray) {
            output = "";
            for (int j = 0; j < numPopulate; j++) {
                try {
                    output += arr[j].toString().charAt(0) + "\n";
                }
                catch( java.lang.NullPointerException e) {}
            }
            switch (i) {
                case 0:
                    ttg.getATextArea().setText(output.toUpperCase());
                    break;
                case 1:
                    ttg.getBTextArea().setText(output.toUpperCase());
                    break;
                case 2:
                    ttg.getCTextArea().setText(output.toUpperCase());
                    break;
                case 3:
                    ttg.getDTextArea().setText(output.toUpperCase());
                    break;
                case 4:
                    ttg.getETextArea().setText(output.toUpperCase());
                    break;
                case 5:
                    ttg.getFTextArea().setText(output.toUpperCase());
                    break;
            }
            i++;
        }
    }

    public void ComputeA(TruthTableGUI ttg)
    {
        String left = (String)ttg.getADropLeft().getItemAt(ttg.getADropLeft().getSelectedIndex());
        String right = (String)ttg.getADropRight().getItemAt(ttg.getADropRight().getSelectedIndex());
        String op = (String)ttg.getADropOp().getItemAt(ttg.getADropOp().getSelectedIndex());

        Boolean[] leftArr = new Boolean[16];
        Boolean[] rightArr = new Boolean[16];
        switch(left)
        {
            case "p":
                System.arraycopy(pvars,0,leftArr,0,leftArr.length);
                break;
            case "q":
                System.arraycopy(qvars,0,leftArr,0,leftArr.length);
                break;
            case "r":
                System.arraycopy(rvars,0,leftArr,0,leftArr.length);
                break;
            case "t":
                System.arraycopy(tvars,0,leftArr,0,leftArr.length);
                break;
        }
        switch(right)
        {
            case "p":
                System.arraycopy(pvars,0,rightArr,0,rightArr.length);
                break;
            case "q":
                System.arraycopy(qvars,0,rightArr,0,rightArr.length);
                break;
            case "r":
                System.arraycopy(rvars,0,rightArr,0,rightArr.length);
                break;
            case "t":
                System.arraycopy(tvars,0,rightArr,0,rightArr.length);
                break;
        }
        System.arraycopy(recursivetwiddling(op, leftArr, rightArr), 0, Avars, 0, Avars.length);
    }

    public void ComputeB(TruthTableGUI ttg)
    {
        String left = (String)ttg.getBDropLeft().getItemAt(ttg.getBDropLeft().getSelectedIndex());
        String right = (String)ttg.getBDropRight().getItemAt(ttg.getBDropRight().getSelectedIndex());
        String op = (String)ttg.getBDropOp().getItemAt(ttg.getBDropOp().getSelectedIndex());

        Boolean[] leftArr = new Boolean[16];
        Boolean[] rightArr = new Boolean[16];
        switch(left)
        {
            case "p":
                System.arraycopy(pvars,0,leftArr,0,leftArr.length);
                break;
            case "q":
                System.arraycopy(qvars,0,leftArr,0,leftArr.length);
                break;
            case "r":
                System.arraycopy(rvars,0,leftArr,0,leftArr.length);
                break;
            case "t":
                System.arraycopy(tvars,0,leftArr,0,leftArr.length);
                break;
            case "A":
                System.arraycopy(Avars,0,leftArr,0,leftArr.length);
                break;
        }
        switch(right)
        {
            case "p":
                System.arraycopy(pvars,0,rightArr,0,rightArr.length);
                break;
            case "q":
                System.arraycopy(qvars,0,rightArr,0,rightArr.length);
                break;
            case "r":
                System.arraycopy(rvars,0,rightArr,0,rightArr.length);
                break;
            case "t":
                System.arraycopy(tvars,0,rightArr,0,rightArr.length);
                break;
            case "A":
                System.arraycopy(Avars,0,leftArr,0,leftArr.length);
                break;
        }
        System.arraycopy(recursivetwiddling(op,leftArr,rightArr),0,Avars,0,Avars.length);
    }
    public void ComputeC(TruthTableGUI ttg)
    {
        String left = (String)ttg.getCDropLeft().getItemAt(ttg.getCDropLeft().getSelectedIndex());
        String right = (String)ttg.getCDropRight().getItemAt(ttg.getCDropRight().getSelectedIndex());
        String op = (String)ttg.getCDropOp().getItemAt(ttg.getCDropOp().getSelectedIndex());

        Boolean[] leftArr = new Boolean[16];
        Boolean[] rightArr = new Boolean[16];
        switch(left)
        {
            case "p":
                System.arraycopy(pvars,0,leftArr,0,leftArr.length);
                break;
            case "q":
                System.arraycopy(qvars,0,leftArr,0,leftArr.length);
                break;
            case "r":
                System.arraycopy(rvars,0,leftArr,0,leftArr.length);
                break;
            case "t":
                System.arraycopy(tvars,0,leftArr,0,leftArr.length);
                break;
            case "A":
                System.arraycopy(Avars,0,leftArr,0,leftArr.length);
                break;
            case "B":
            System.arraycopy(Bvars,0,leftArr,0,leftArr.length);
            break;
        }
        switch(right)
        {
            case "p":
                System.arraycopy(pvars,0,rightArr,0,rightArr.length);
                break;
            case "q":
                System.arraycopy(qvars,0,rightArr,0,rightArr.length);
                break;
            case "r":
                System.arraycopy(rvars,0,rightArr,0,rightArr.length);
                break;
            case "t":
                System.arraycopy(tvars,0,rightArr,0,rightArr.length);
                break;
            case "A":
                System.arraycopy(Avars,0,leftArr,0,leftArr.length);
                break;
            case "B":
                System.arraycopy(Bvars,0,leftArr,0,leftArr.length);
                break;
        }
        System.arraycopy(recursivetwiddling(op,leftArr,rightArr),0,Avars,0,Avars.length);
    }
    public void ComputeD(TruthTableGUI ttg)
    {
        String left = (String)ttg.getDDropLeft().getItemAt(ttg.getDDropLeft().getSelectedIndex());
        String right = (String)ttg.getDDropRight().getItemAt(ttg.getDDropRight().getSelectedIndex());
        String op = (String)ttg.getDDropOp().getItemAt(ttg.getDDropOp().getSelectedIndex());

        Boolean[] leftArr = new Boolean[16];
        Boolean[] rightArr = new Boolean[16];
        switch(left)
        {
            case "p":
                System.arraycopy(pvars,0,leftArr,0,leftArr.length);
                break;
            case "q":
                System.arraycopy(qvars,0,leftArr,0,leftArr.length);
                break;
            case "r":
                System.arraycopy(rvars,0,leftArr,0,leftArr.length);
                break;
            case "t":
                System.arraycopy(tvars,0,leftArr,0,leftArr.length);
                break;
            case "A":
                System.arraycopy(Avars,0,leftArr,0,leftArr.length);
                break;
            case "B":
                System.arraycopy(Bvars,0,leftArr,0,leftArr.length);
                break;
            case "C":
                System.arraycopy(Cvars,0,leftArr,0,leftArr.length);
                break;
        }
        switch(right)
        {
            case "p":
                System.arraycopy(pvars,0,rightArr,0,rightArr.length);
                break;
            case "q":
                System.arraycopy(qvars,0,rightArr,0,rightArr.length);
                break;
            case "r":
                System.arraycopy(rvars,0,rightArr,0,rightArr.length);
                break;
            case "t":
                System.arraycopy(tvars,0,rightArr,0,rightArr.length);
                break;
            case "A":
                System.arraycopy(Avars,0,leftArr,0,leftArr.length);
                break;
            case "B":
                System.arraycopy(Bvars,0,leftArr,0,leftArr.length);
                break;
            case "C":
                System.arraycopy(Cvars,0,leftArr,0,leftArr.length);
                break;
        }
        System.arraycopy(recursivetwiddling(op,leftArr,rightArr),0,Avars,0,Avars.length);
    }
    public void ComputeE(TruthTableGUI ttg)
    {
        String left = (String)ttg.getEDropLeft().getItemAt(ttg.getEDropLeft().getSelectedIndex());
        String right = (String)ttg.getEDropRight().getItemAt(ttg.getEDropRight().getSelectedIndex());
        String op = (String)ttg.getEDropOp().getItemAt(ttg.getEDropOp().getSelectedIndex());

        Boolean[] leftArr = new Boolean[16];
        Boolean[] rightArr = new Boolean[16];
        switch(left)
        {
            case "p":
                System.arraycopy(pvars,0,leftArr,0,leftArr.length);
                break;
            case "q":
                System.arraycopy(qvars,0,leftArr,0,leftArr.length);
                break;
            case "r":
                System.arraycopy(rvars,0,leftArr,0,leftArr.length);
                break;
            case "t":
                System.arraycopy(tvars,0,leftArr,0,leftArr.length);
                break;
            case "A":
                System.arraycopy(Avars,0,leftArr,0,leftArr.length);
                break;
            case "B":
                System.arraycopy(Bvars,0,leftArr,0,leftArr.length);
                break;
            case "C":
                System.arraycopy(Cvars,0,leftArr,0,leftArr.length);
                break;
            case "D":
                System.arraycopy(Dvars,0,leftArr,0,leftArr.length);
                break;
        }
        switch(right)
        {
            case "p":
                System.arraycopy(pvars,0,rightArr,0,rightArr.length);
                break;
            case "q":
                System.arraycopy(qvars,0,rightArr,0,rightArr.length);
                break;
            case "r":
                System.arraycopy(rvars,0,rightArr,0,rightArr.length);
                break;
            case "t":
                System.arraycopy(tvars,0,rightArr,0,rightArr.length);
                break;
            case "A":
                System.arraycopy(Avars,0,leftArr,0,leftArr.length);
                break;
            case "B":
                System.arraycopy(Bvars,0,leftArr,0,leftArr.length);
                break;
            case "C":
                System.arraycopy(Cvars,0,leftArr,0,leftArr.length);
                break;
            case "D":
                System.arraycopy(Dvars,0,leftArr,0,leftArr.length);
                break;
        }
        System.arraycopy(recursivetwiddling(op,leftArr,rightArr),0,Avars,0,Avars.length);
    }
    public void ComputeF(TruthTableGUI ttg)
    {
        String left = (String)ttg.getFDropLeft().getItemAt(ttg.getFDropLeft().getSelectedIndex());
        String right = (String)ttg.getFDropRight().getItemAt(ttg.getFDropRight().getSelectedIndex());
        String op = (String)ttg.getFDropOp().getItemAt(ttg.getFDropOp().getSelectedIndex());

        Boolean[] leftArr = new Boolean[16];
        Boolean[] rightArr = new Boolean[16];
        switch(left)
        {
            case "p":
                System.arraycopy(pvars,0,leftArr,0,leftArr.length);
                break;
            case "q":
                System.arraycopy(qvars,0,leftArr,0,leftArr.length);
                break;
            case "r":
                System.arraycopy(rvars,0,leftArr,0,leftArr.length);
                break;
            case "t":
                System.arraycopy(tvars,0,leftArr,0,leftArr.length);
                break;
            case "A":
                System.arraycopy(Avars,0,leftArr,0,leftArr.length);
                break;
            case "B":
                System.arraycopy(Bvars,0,leftArr,0,leftArr.length);
                break;
            case "C":
                System.arraycopy(Cvars,0,leftArr,0,leftArr.length);
                break;
            case "D":
                System.arraycopy(Dvars,0,leftArr,0,leftArr.length);
                break;
            case "E":
                System.arraycopy(Evars,0,leftArr,0,leftArr.length);
                break;
        }
        switch(right)
        {
            case "p":
                System.arraycopy(pvars,0,rightArr,0,rightArr.length);
                break;
            case "q":
                System.arraycopy(qvars,0,rightArr,0,rightArr.length);
                break;
            case "r":
                System.arraycopy(rvars,0,rightArr,0,rightArr.length);
                break;
            case "t":
                System.arraycopy(tvars,0,rightArr,0,rightArr.length);
                break;
            case "A":
                System.arraycopy(Avars,0,leftArr,0,leftArr.length);
                break;
            case "B":
                System.arraycopy(Bvars,0,leftArr,0,leftArr.length);
                break;
            case "C":
                System.arraycopy(Cvars,0,leftArr,0,leftArr.length);
                break;
            case "D":
                System.arraycopy(Dvars,0,leftArr,0,leftArr.length);
                break;
            case "E":
                System.arraycopy(Evars,0,leftArr,0,leftArr.length);
                break;
        }
        System.arraycopy(recursivetwiddling(op,leftArr,rightArr),0,Avars,0,Avars.length);
    }

    public Boolean[] recursivetwiddling(String op, Boolean[] left, Boolean[] right) {
        Boolean[] ret = new Boolean[16];
        switch (op) {
            case "AND":
                for (int i = 0; i < ret.length; i++) {
                    ret[i] = left[i] & right[i];
                }
                break;
            case "OR":
                for (int i = 0; i < ret.length; i++) {
                    ret[i] = left[i] | right[i];
                }
                break;
            case "XOR":
                for (int i = 0; i < ret.length; i++) {
                    ret[i] = left[i] ^ right[i];
                }
                break;
            case "NOT":
                for (int i = 0; i < ret.length; i++) {
                    ret[i] = !left[i];
                }
                break;
            case "NAND":
                for (int i = 0; i < ret.length; i++) {
                    ret[i] = !(left[i] & right[i]);
                }
                break;
            case "NOR":
                for (int i = 0; i < ret.length; i++) {
                    ret[i] = !(left[i] | right[i]);
                }
                break;
        }
        return ret;
    }
}
