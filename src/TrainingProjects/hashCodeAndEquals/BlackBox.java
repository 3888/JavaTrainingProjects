package TrainingProjects.hashCodeAndEquals;

public class BlackBox {

    private int varA;
    private int varB;

    BlackBox(int varA, int varB){
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public int hashCode() {
// http://ru-java.livejournal.com/737854.html
//  ������ ��� ���������� hashCode ������� �������� ������������� ��������� �� ������� ����� (��� �������, �� 31)
        final int prime = 31;
        int result = 1;
        result = prime * result + varA;
        result = prime * result + varB;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BlackBox other = (BlackBox) obj;
        if (varA != other.varA)
            return false;
        if (varB != other.varB)
            return false;
        return true;
    }
}