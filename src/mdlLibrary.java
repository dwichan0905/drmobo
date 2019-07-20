/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dwi Candra Permana
 */
public class mdlLibrary {
    public static String amibios(String beepcode) {
        String problems = null, solutions = null;
        switch (beepcode) {
            case "1 Pendek":
                problems = "DRAM Refresh Failure";
                solutions = "";
                break;
            case "2 Pendek":
                problems = "Parity circuit failure";
                solutions = "";
                break;
            case "3 Pendek":
                problems = "Base 64K RAM Failure";
                solutions = "";
                break;
            case "4 Pendek":
                problems = "System timer failure";
                solutions = "";
                break;
            case "5 Pendek":
                problems = "Process Failure";
                solutions = "";
                break;
            case "6 Pendek":
                problems = "Keyboard controller Gate A20 error";
                solutions = "";
                break;
            case "7 Pendek":
                problems = "Virtual mode exception error";
                solutions = "";
                break;
            case "8 Pendek":
                problems = "Display memory Read/Write test failure";
                solutions = "";
                break;
            case "9 Pendek":
                problems = "ROM BIOS checksum error";
                solutions = "";
                break;
            case "10 Pendek":
                problems = "CMOS shutdown Read/Write error";
                solutions = "";
                break;
            case "11 Pendek":
                problems = "Cache memory error";
                solutions = "";
                break;
            case "1 Panjang, 3 Pendek":
                problems = "Conventional/Extended memory failure";
                solutions = "";
                break;
            case "1 Panjang, 8 Pendek":
                problems = "Display/Retrace test failed";
                solutions = "";
                break;
            case "Dua Nada yang berbeda":
                problems = "Low CPU Fan speed, voltage level issue";
                solutions = "";
                break;
        }
        return "<html><b><u>MASALAH:</u></b><br>"
                + problems + "<br>"
                + "<b><u>SOLUSI:</u></b>"
                + solutions + "</html>";
    }
    
    public static String awardbios(String beepcode) {
        String problems = null, solutions = null;
        switch (beepcode) {
            case "1 Panjang, 2 Pendek":
                problems = "DRAM Refresh Failure";
                solutions = "";
                break;
            case "1 Panjang, 3 Pendek":
                problems = "Parity circuit failure";
                solutions = "";
                break;
            case "Berulang tanpa henti":
                problems = "Base 64K RAM Failure";
                solutions = "";
                break;
            case "Berulang-ulang dan bernada tinggi ketika PC dihidupkan":
                problems = "System timer failure";
                solutions = "";
                break;
            case "Bunyi nada tinggi dan nada rendah berulang-ulang":
                problems = "Process Failure";
                solutions = "";
                break;
        }
        return "<html><b><u>MASALAH:</u></b><br>"
                + problems + "<br>"
                + "<b><u>SOLUSI:</u></b>"
                + solutions + "</html>";
    }
    
    public static String dell(String beepcode) {
        String problems = null, solutions = null;
        switch (beepcode) {
            case "1 Pendek":
                problems = "BIOS ROM corruption or failure";
                solutions = "";
                break;
            case "2 Pendek":
                problems = "Memory (RAM) not detected";
                solutions = "";
                break;
            case "3 Pendek":
                problems = "Motherboard Failure";
                solutions = "";
                break;
            case "4 Pendek":
                problems = "Memory (RAM) Failure";
                solutions = "";
                break;
            case "5 Pendek":
                problems = "CMOS battery failure";
                solutions = "";
                break;
            case "6 Pendek":
                problems = "Video Card failure";
                solutions = "";
                break;
            case "7 Pendek":
                problems = "Bad Processor (CPU)";
                solutions = "";
                break;
        }
        return "<html><b><u>MASALAH:</u></b><br>"
                + problems + "<br>"
                + "<b><u>SOLUSI:</u></b>"
                + solutions + "</html>";
    }
    public static String ibm(String beepcode) {
        String problems = null, solutions = null;
        switch (beepcode) {
            case "Tidak ada bunyi":
                problems = "No power, loose card, or short";
                solutions = "";
                break;
            case "1 bunyi pendek":
                problems = "Normal";
                solutions = "";
                break;
            case "2 bunyi pendek":
                problems = "POST ERROR";
                solutions = "Lihat pada layar untuk keterangan errornya.";
                break;
            case "Bunyi Berlanjut":
                problems = "No power, loose card, or short";
                solutions = "";
                break;
            case "Bunyi pendek berulang-ulang":
                problems = "No power, loose card, or short";
                solutions = "";
                break;
            case "1 panjang dan 1 pendek":
                problems = "Masalah pada Motherboard";
                solutions = "";
                break;
            case "1 panjang dan 2 pendek":
                problems = "Video (Mono/CGA display circuitry) issue.";
                solutions = "";
                break;
            case "1 panjang dan 3 pendek":
                problems = "Video (EGA) display circuitry.";
                solutions = "";
                break;
            case "3 panjang":
                problems = "Keyboard or keyboard card error.";
                solutions = "";
                break;
            case "1 bunyi, tampilan kosong atau kacau":
                problems = "Video display circuitry.";
                solutions = "";
                break;
        }
        return "<html><b><u>MASALAH:</u></b><br>"
                + problems + "<br>"
                + "<b><u>SOLUSI:</u></b>"
                + solutions + "</html>";
    }
    public static String macintosh(String beepcode) {
        String problems = null, solutions = null;
        switch (beepcode) {
            case "Nada Error (dua bentuk nada berbeda)":
                problems = "Masalah di Logic Board atau Bus SCSI";
                solutions = "";
                break;
            case "Bunyi startup, putaran disk, tidak ada tampilan":
                problems = "Masalah pada kontroler video";
                solutions = "";
                break;
            case "Power menyala, tidak ada bunyi":
                problems = "Masalah pada Logic Board";
                solutions = "Lihat pada layar untuk keterangan errornya.";
                break;
            case "Bunyi keras, 4 bunyi lebih keras":
                problems = "Masalah pada SIMM";
                solutions = "";
                break;
        }
        return "<html><b><u>MASALAH:</u></b><br>"
                + problems + "<br>"
                + "<b><u>SOLUSI:</u></b>"
                + solutions + "</html>";
    }
    public static String phoenix(String beepcode) {
        String problems = null, solutions = null;
        switch (beepcode) {
            case "1-1-1-1":
                problems = "Bunyi beep belum dikonfirmasi";
                solutions = "Pasang ulang RAM atau ganti RAM yang bermasalah.";
                break;
            case "1-1-1-3":
                problems = "Verify real mode";
                solutions = "";
                break;
            case "1-1-2-1":
                problems = "Get CPU type";
                solutions = "";
                break;
            case "1-1-2-3":
                problems = "Initialize system hardware";
                solutions = "";
                break;
            case "1-1-3-1":
                problems = "Initialize chipset registers with initial POST values";
                solutions = "";
                break;
            case "1-1-3-2":
                problems = "Set in POST flag";
                solutions = "";
                break;
            case "1-1-3-3":
                problems = "Initialize CPU registers";
                solutions = "";
                break;
            case "1-1-4-1":
                problems = "Initialize cache to initial POST values";
                solutions = "";
                break;
            case "1-1-4-3":
                problems = "Initialize I/O";
                solutions = "";
                break;
            case "1-2-1-1":
                problems = "Initialize power management";
                solutions = "";
                break;
            case "1-2-1-2":
                problems = "Load alternate registers with initial POST values";
                solutions = "";
                break;
            case "1-2-1-3":
                problems = "Jump to UserPatch0";
                solutions = "";
                break;
            case "1-2-2-1":
                problems = "Initialize keyboard controller";
                solutions = "";
                break;
            case "1-2-2-3":
                problems = "BIOS ROM checksum";
                solutions = "";
                break;
            case "1-2-3-1":
                problems = "8254 timer initialization";
                solutions = "";
                break;
            case "1-2-3-3":
                problems = "8237 DMA controller initialization";
                solutions = "";
                break;
            case "1-2-4-1":
                problems = "Reset programmable interrupt controller";
                solutions = "";
                break;
            case "1-3-1-1":
                problems = "Test DRAM refresh";
                solutions = "";
                break;
            case "1-3-1-3":
                problems = "Test 8742 keyboard controller";
                solutions = "";
                break;
            case "1-3-2-1":
                problems = "Set ES segment to register to 4 GB";
                solutions = "";
                break;
            case "1-3-3-1":
                problems = "Autosize DRAM";
                solutions = "";
                break;
            case "1-3-3-3":
                problems = "Clear 512 K base RAM";
                solutions = "";
                break;
            case "1-3-4-1":
                problems = "Test 512 base address lines";
                solutions = "";
                break;
            case "1-3-4-3":
                problems = "Test 512 K base memory";
                solutions = "";
                break;
            case "1-4-1-3":
                problems = "Test CPU bus clock frequency";
                solutions = "";
                break;
            case "1-4-2-4":
                problems = "Reinitialize the chipset";
                solutions = "";
                break;
            case "1-4-3-1":
                problems = "Shadow system BIOS ROM";
                solutions = "";
                break;
            case "1-4-3-2":
                problems = "Reinitialize the cache";
                solutions = "";
                break;
            case "1-4-3-3":
                problems = "Autosize cache";
                solutions = "";
                break;
            case "1-4-4-1":
                problems = "Configure advanced chipset registers";
                solutions = "";
                break;
            case "1-4-4-2":
                problems = "Load alternate registers with CMOS values.";
                solutions = "";
                break;
            case "2-1-1-1":
                problems = "Set initial CPU speed";
                solutions = "";
                break;
            case "2-1-1-3":
                problems = "Initialize interrupt vectors";
                solutions = "";
                break;
            case "2-1-2-1":
                problems = "Initialize BIOS interrupts";
                solutions = "";
                break;
            case "2-1-2-3":
                problems = "Check ROM Copyright notice";
                solutions = "";
                break;
            case "2-1-2-4":
                problems = "Initialize manager for PCI options ROMs";
                solutions = "";
                break;
            case "2-1-3-1":
                problems = "Check video configuration against CMOS";
                solutions = "";
                break;
            case "2-1-3-2":
                problems = "Initialize PCI bus and devices";
                solutions = "";
                break;
            case "2-1-3-3":
                problems = "Initialize all video adapters in system";
                solutions = "";
                break;
            case "2-1-4-1":
                problems = "Shadow video BIOS ROM";
                solutions = "";
                break;
            case "2-1-4-3":
                problems = "Display Copyright notice";
                solutions = "";
                break;
        }
        return "<html><b><u>MASALAH:</u></b><br>"
                + problems + "<br>"
                + "<b><u>SOLUSI:</u></b>"
                + solutions + "</html>";
    }
}
