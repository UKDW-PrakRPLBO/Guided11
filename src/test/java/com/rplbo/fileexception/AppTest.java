package com.rplbo.fileexception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    /**
     * Rigorous Test :-)
     */
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testPertama() throws IncorrectFileNameException {
        assertThrows(IncorrectFileNameException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                String nmfile = "";
                if(nmfile == "" || nmfile.length() == 0)
                    throw new IncorrectFileNameException("Nama file tidak boleh kosong");
            }
        },"Nama file tidak boleh kosong");
    }

    @Test
    public void testKedua() throws IncorrectFileNameException{
        assertThrows(IncorrectFileNameException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                String nmfile = "aNTon.txt";
                if (!Character.isUpperCase(nmfile.charAt(0)))
                    throw new IncorrectFileNameException("Huruf pertama harus huruf besar");
            }
        },"Huruf pertama harus huruf besar");
    }

    @Test
    public void testKetiga() throws IncorrectFileNameException {
        assertThrows(IncorrectFileNameException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                String nmfile = "aNTon ius.txt";
                if (nmfile.contains(" "))
                    throw new IncorrectFileNameException("Tidak boleh mengandung spasi");
            }
        },"Tidak boleh mengandung spasi");
    }

    @Test
    public void testKeempat() throws IncorrectFileNameException {
        assertThrows(IncorrectFileNameException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                String nmfile = "aNTonius";
                if(nmfile.lastIndexOf(".")<0)
                    throw new IncorrectFileNameException("Harus memiliki ekstensi file");
            }
        },"Harus memiliki ekstensi file");
    }

    @Test
    public void testKelima() throws IncorrectFileNameException {
        assertThrows(IncorrectFileNameException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                String nmfile = "aNTonius.tx";
                if(nmfile.lastIndexOf(".")>0) {
                    String extension = nmfile.substring(nmfile.lastIndexOf(".") + 1);
                    if (extension.length() < 3) {
                        throw new IncorrectFileNameException("Ekstensi file harus minimal 3 karakter");
                    }
                }
            }
        },"Ekstensi file harus minimal 3 karakter");
    }
}
