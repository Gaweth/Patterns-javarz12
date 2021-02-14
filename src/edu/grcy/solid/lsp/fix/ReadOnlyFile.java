package edu.grcy.solid.lsp.fix;

public class ReadOnlyFile implements FileReadable{
    @Override
    public byte[] read() {
        System.out.println("klasa ReadOnlyFiles implementuje tylko jeden interfejs");
        return new byte[0];
    }
}
