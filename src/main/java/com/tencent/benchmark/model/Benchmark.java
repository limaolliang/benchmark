package com.tencent.benchmark.model;

public class Benchmark {
    private Integer id;

    private String carName;

    private String deviceName;

    private Integer antutuTotalScoreOpengl2;

    private Integer antutuTotalScoreOpengl3;

    private String androidVersion;

    private String cpuMicroRchitecture;

    private String cpuType;

    private Integer dmipsActual;

    private Integer dmipsPridict;

    private Integer cpuFrequency;

    private Integer ddrFrequency;

    private Integer memorySize;

    private String gpuType;

    private String gpuVersion;

    private Integer antutuCpuSinglecoreScore;

    private Integer antutuCpuSinglecoreNormalcalScore;

    private Integer antutuCpuMulticoreScore;

    private Integer antutuRamScore;

    private Integer antutuRomScore;

    private Integer antutuDataProcessScore;

    private Integer antutuImgProcessScore;

    private Integer antutuDataSecurityScore;

    private Integer antutuH5Score;

    private Double sdbenchRamCopySpeed;

    private Double sdbenchSdcardReadSpeed;

    private Double sdbenchSdcardWriteSpeed;

    private Double sdbenchRomReadSpeed;

    private Double sdbenchRomWriteSpeed;

    private Double androbenchSeqReadSpeed;

    private Double androbenchSeqWriteSpeed;

    private Double androbenchRandomReadSpeed;

    private Double androbenchRandomWriteSpeed;

    private Double androbenchSqlInsert;

    private Double androbenchSqlUpdate;

    private Double androbenchSqlDelete;

    private Double netPing;

    private Double netSpeed;

    private Integer gpsNumber;

    private Integer gpsIntensity;

    private byte[] bluetoothBasicFunction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName == null ? null : carName.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public Integer getAntutuTotalScoreOpengl2() {
        return antutuTotalScoreOpengl2;
    }

    public void setAntutuTotalScoreOpengl2(Integer antutuTotalScoreOpengl2) {
        this.antutuTotalScoreOpengl2 = antutuTotalScoreOpengl2;
    }

    public Integer getAntutuTotalScoreOpengl3() {
        return antutuTotalScoreOpengl3;
    }

    public void setAntutuTotalScoreOpengl3(Integer antutuTotalScoreOpengl3) {
        this.antutuTotalScoreOpengl3 = antutuTotalScoreOpengl3;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion == null ? null : androidVersion.trim();
    }

    public String getCpuMicroRchitecture() {
        return cpuMicroRchitecture;
    }

    public void setCpuMicroRchitecture(String cpuMicroRchitecture) {
        this.cpuMicroRchitecture = cpuMicroRchitecture == null ? null : cpuMicroRchitecture.trim();
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType == null ? null : cpuType.trim();
    }

    public Integer getDmipsActual() {
        return dmipsActual;
    }

    public void setDmipsActual(Integer dmipsActual) {
        this.dmipsActual = dmipsActual;
    }

    public Integer getDmipsPridict() {
        return dmipsPridict;
    }

    public void setDmipsPridict(Integer dmipsPridict) {
        this.dmipsPridict = dmipsPridict;
    }

    public Integer getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(Integer cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public Integer getDdrFrequency() {
        return ddrFrequency;
    }

    public void setDdrFrequency(Integer ddrFrequency) {
        this.ddrFrequency = ddrFrequency;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType == null ? null : gpuType.trim();
    }

    public String getGpuVersion() {
        return gpuVersion;
    }

    public void setGpuVersion(String gpuVersion) {
        this.gpuVersion = gpuVersion == null ? null : gpuVersion.trim();
    }

    public Integer getAntutuCpuSinglecoreScore() {
        return antutuCpuSinglecoreScore;
    }

    public void setAntutuCpuSinglecoreScore(Integer antutuCpuSinglecoreScore) {
        this.antutuCpuSinglecoreScore = antutuCpuSinglecoreScore;
    }

    public Integer getAntutuCpuSinglecoreNormalcalScore() {
        return antutuCpuSinglecoreNormalcalScore;
    }

    public void setAntutuCpuSinglecoreNormalcalScore(Integer antutuCpuSinglecoreNormalcalScore) {
        this.antutuCpuSinglecoreNormalcalScore = antutuCpuSinglecoreNormalcalScore;
    }

    public Integer getAntutuCpuMulticoreScore() {
        return antutuCpuMulticoreScore;
    }

    public void setAntutuCpuMulticoreScore(Integer antutuCpuMulticoreScore) {
        this.antutuCpuMulticoreScore = antutuCpuMulticoreScore;
    }

    public Integer getAntutuRamScore() {
        return antutuRamScore;
    }

    public void setAntutuRamScore(Integer antutuRamScore) {
        this.antutuRamScore = antutuRamScore;
    }

    public Integer getAntutuRomScore() {
        return antutuRomScore;
    }

    public void setAntutuRomScore(Integer antutuRomScore) {
        this.antutuRomScore = antutuRomScore;
    }

    public Integer getAntutuDataProcessScore() {
        return antutuDataProcessScore;
    }

    public void setAntutuDataProcessScore(Integer antutuDataProcessScore) {
        this.antutuDataProcessScore = antutuDataProcessScore;
    }

    public Integer getAntutuImgProcessScore() {
        return antutuImgProcessScore;
    }

    public void setAntutuImgProcessScore(Integer antutuImgProcessScore) {
        this.antutuImgProcessScore = antutuImgProcessScore;
    }

    public Integer getAntutuDataSecurityScore() {
        return antutuDataSecurityScore;
    }

    public void setAntutuDataSecurityScore(Integer antutuDataSecurityScore) {
        this.antutuDataSecurityScore = antutuDataSecurityScore;
    }

    public Integer getAntutuH5Score() {
        return antutuH5Score;
    }

    public void setAntutuH5Score(Integer antutuH5Score) {
        this.antutuH5Score = antutuH5Score;
    }

    public Double getSdbenchRamCopySpeed() {
        return sdbenchRamCopySpeed;
    }

    public void setSdbenchRamCopySpeed(Double sdbenchRamCopySpeed) {
        this.sdbenchRamCopySpeed = sdbenchRamCopySpeed;
    }

    public Double getSdbenchSdcardReadSpeed() {
        return sdbenchSdcardReadSpeed;
    }

    public void setSdbenchSdcardReadSpeed(Double sdbenchSdcardReadSpeed) {
        this.sdbenchSdcardReadSpeed = sdbenchSdcardReadSpeed;
    }

    public Double getSdbenchSdcardWriteSpeed() {
        return sdbenchSdcardWriteSpeed;
    }

    public void setSdbenchSdcardWriteSpeed(Double sdbenchSdcardWriteSpeed) {
        this.sdbenchSdcardWriteSpeed = sdbenchSdcardWriteSpeed;
    }

    public Double getSdbenchRomReadSpeed() {
        return sdbenchRomReadSpeed;
    }

    public void setSdbenchRomReadSpeed(Double sdbenchRomReadSpeed) {
        this.sdbenchRomReadSpeed = sdbenchRomReadSpeed;
    }

    public Double getSdbenchRomWriteSpeed() {
        return sdbenchRomWriteSpeed;
    }

    public void setSdbenchRomWriteSpeed(Double sdbenchRomWriteSpeed) {
        this.sdbenchRomWriteSpeed = sdbenchRomWriteSpeed;
    }

    public Double getAndrobenchSeqReadSpeed() {
        return androbenchSeqReadSpeed;
    }

    public void setAndrobenchSeqReadSpeed(Double androbenchSeqReadSpeed) {
        this.androbenchSeqReadSpeed = androbenchSeqReadSpeed;
    }

    public Double getAndrobenchSeqWriteSpeed() {
        return androbenchSeqWriteSpeed;
    }

    public void setAndrobenchSeqWriteSpeed(Double androbenchSeqWriteSpeed) {
        this.androbenchSeqWriteSpeed = androbenchSeqWriteSpeed;
    }

    public Double getAndrobenchRandomReadSpeed() {
        return androbenchRandomReadSpeed;
    }

    public void setAndrobenchRandomReadSpeed(Double androbenchRandomReadSpeed) {
        this.androbenchRandomReadSpeed = androbenchRandomReadSpeed;
    }

    public Double getAndrobenchRandomWriteSpeed() {
        return androbenchRandomWriteSpeed;
    }

    public void setAndrobenchRandomWriteSpeed(Double androbenchRandomWriteSpeed) {
        this.androbenchRandomWriteSpeed = androbenchRandomWriteSpeed;
    }

    public Double getAndrobenchSqlInsert() {
        return androbenchSqlInsert;
    }

    public void setAndrobenchSqlInsert(Double androbenchSqlInsert) {
        this.androbenchSqlInsert = androbenchSqlInsert;
    }

    public Double getAndrobenchSqlUpdate() {
        return androbenchSqlUpdate;
    }

    public void setAndrobenchSqlUpdate(Double androbenchSqlUpdate) {
        this.androbenchSqlUpdate = androbenchSqlUpdate;
    }

    public Double getAndrobenchSqlDelete() {
        return androbenchSqlDelete;
    }

    public void setAndrobenchSqlDelete(Double androbenchSqlDelete) {
        this.androbenchSqlDelete = androbenchSqlDelete;
    }

    public Double getNetPing() {
        return netPing;
    }

    public void setNetPing(Double netPing) {
        this.netPing = netPing;
    }

    public Double getNetSpeed() {
        return netSpeed;
    }

    public void setNetSpeed(Double netSpeed) {
        this.netSpeed = netSpeed;
    }

    public Integer getGpsNumber() {
        return gpsNumber;
    }

    public void setGpsNumber(Integer gpsNumber) {
        this.gpsNumber = gpsNumber;
    }

    public Integer getGpsIntensity() {
        return gpsIntensity;
    }

    public void setGpsIntensity(Integer gpsIntensity) {
        this.gpsIntensity = gpsIntensity;
    }

    public byte[] getBluetoothBasicFunction() {
        return bluetoothBasicFunction;
    }

    public void setBluetoothBasicFunction(byte[] bluetoothBasicFunction) {
        this.bluetoothBasicFunction = bluetoothBasicFunction;
    }
}