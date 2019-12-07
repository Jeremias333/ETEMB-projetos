package com.utils;
import javax.swing.text.*;

@SuppressWarnings("serial")

public class LimitaNroCaracteres extends PlainDocument {
    private int iMaxLength;
    
    public LimitaNroCaracteres(int maxlen) {
        super();
        iMaxLength = maxlen;
    }
    
    @Override
    public void insertString(int offset, String str, AttributeSet attr)
                    throws BadLocationException {
        if (str == null) return;
        if (iMaxLength <= 0)        // aceitara qualquer no. de caracteres
        {
            super.insertString(offset, str.toUpperCase(), attr);
            return;
        }
        int ilen = (getLength() + str.length());
        if (ilen <= iMaxLength)    // se o comprimento final for menor...
            super.insertString(offset, str, attr);   // ...aceita str
        }
}
