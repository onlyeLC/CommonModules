package com.onlye.utils

import android.os.Build
import java.io.BufferedReader
import java.io.FileReader

class PhoneUtils {
    /**
     * 获取设备的CPU名称
     */
    fun getCpuName(): String? {
        var cpuName: String? = null
        try {
            val fileReader = FileReader("/proc/cpuinfo")
            val bufferedReader = BufferedReader(fileReader)
            var line: String?
            while (bufferedReader.readLine().also { line = it } != null) {
                if (line!!.contains("Hardware")) {
                    val split = line!!.split(":".toRegex()).toTypedArray()
                    cpuName = split[1].trim()
                    break
                }
            }
            bufferedReader.close()
            fileReader.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return cpuName
    }

//    //从文件获取核心数
//    private static int getCoresFromFileInfo(String fileLocation) {
//        InputStream is = null;
//        try {
//            is = new FileInputStream(fileLocation);
//            BufferedReader buf = new BufferedReader(new InputStreamReader(is));
//            String fileContents = buf.readLine();
//            buf.close();
//            return getCoresFromFileString(fileContents);
//        } catch (IOException e) {
//            return DEVICEINFO_UNKNOWN;
//        } finally {
//            if (is != null) {
//                try {
//                    is.close();
//                } catch (IOException e) {
//                    // Do nothing.
//                }
//            }
//        }
//    }
////获取CPU核心数
//    public static int getNumberOfCPUCores() {
//        int cores;
//        try {
//            cores = getCoresFromFileInfo("/sys/devices/system/cpu/possible");
//            if (cores == DEVICEINFO_UNKNOWN) {
//                cores = getCoresFromFileInfo("/sys/devices/system/cpu/present");
//            }
//            if (cores == DEVICEINFO_UNKNOWN) {
//                cores = new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;;
//            }
//        } catch (SecurityException e) {
//            cores = DEVICEINFO_UNKNOWN;
//        } catch (NullPointerException e) {
//            cores = DEVICEINFO_UNKNOWN;
//        }
//        return cores;
//    }
////获取CPU最大主频
//    public static int getCPUMaxFreqKHz() {
//        int maxFreq = DEVICEINFO_UNKNOWN;
//        try {
//            for (int i = 0; i < getNumberOfCPUCores(); i++) {
//                String filename =
//                "/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq";
//                File cpuInfoMaxFreqFile = new File(filename);
//                if (cpuInfoMaxFreqFile.exists() && cpuInfoMaxFreqFile.canRead()) {
//                    byte[] buffer = new byte[128];
//                    FileInputStream stream = new FileInputStream(cpuInfoMaxFreqFile);
//                    try {
//                        stream.read(buffer);
//                        int endIndex = 0;
//                        //Trim the first number out of the byte buffer.
//                        while (Character.isDigit(buffer[endIndex]) && endIndex < buffer.length) {
//                            endIndex++;
//                        }
//                        String str = new String(buffer, 0, endIndex);
//                        Integer freqBound = Integer.parseInt(str);
//                        if (freqBound > maxFreq) {
//                            maxFreq = freqBound;
//                        }
//                    } catch (NumberFormatException e) {
//                        //Fall through and use /proc/cpuinfo.
//                    } finally {
//                        stream.close();
//                    }
//                }
//            }
//            if (maxFreq == DEVICEINFO_UNKNOWN) {
//                FileInputStream stream = new FileInputStream("/proc/cpuinfo");
//                try {
//                    int freqBound = parseFileForValue("cpu MHz", stream);
//                    freqBound *= 1000; //MHz -> kHz
//                    if (freqBound > maxFreq) maxFreq = freqBound;
//                } finally {
//                    stream.close();
//                }
//            }
//        } catch (IOException e) {
//            maxFreq = DEVICEINFO_UNKNOWN; //Fall through and return unknown.
//        }
//        return maxFreq;
//    }

//    //获取RAM容量
//    public static long getTotalMemory(Context c) {
//        // memInfo.totalMem not supported in pre-Jelly Bean APIs.
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
//            ActivityManager.MemoryInfo memInfo = new ActivityManager.MemoryInfo();
//            ActivityManager am = (ActivityManager) c.getSystemService(Context.ACTIVITY_SERVICE);
//            am.getMemoryInfo(memInfo);
//            if (memInfo != null) {
//                return memInfo.totalMem;
//            } else {
//                return DEVICEINFO_UNKNOWN;
//            }
//        } else {
//            long totalMem = DEVICEINFO_UNKNOWN;
//            try {
//                FileInputStream stream = new FileInputStream("/proc/meminfo");
//                try {
//                    totalMem = parseFileForValue("MemTotal", stream);
//                    totalMem *= 1024;
//                } finally {
//                    stream.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return totalMem;
//        }
//    }
//    //手机机型
//    public static String getModel() {
//        return Build.MODEL;
//    }
//// 厂商信息
//    public static String getBrand() {
//        return Build.BRAND;
//    }
}