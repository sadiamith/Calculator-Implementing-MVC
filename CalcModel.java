public class CalcModel {
    private static final Integer INITIAL_VALUE = 1;
    private Integer m_total;

    //Constructor
    CalcModel(){
        reset();
    }
    public void reset(){
        m_total = new Integer(INITIAL_VALUE);
    }
    public void multiplyBy(String operand){
        m_total = m_total * Integer.parseInt(operand);
    }
    public void setValue(String value) {
        m_total = new Integer(value);
    }
    public String getValue() {
        return m_total.toString();
    }
}
