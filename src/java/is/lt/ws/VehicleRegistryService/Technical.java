/**
 * Technical.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package is.lt.ws.VehicleRegistryService;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Technical  implements java.io.Serializable {
    private is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData;

    private java.lang.String vehgroup;

    private java.lang.String engine;

    private java.lang.String pass;

    private java.lang.String passbydr;

    private java.lang.String engingemanuf;

    private java.lang.String enginecode;

    private java.lang.String workingpr;

    private java.lang.String directinj;

    private java.lang.String nocylinders;

    private java.lang.String arrcylinders;

    private java.lang.String capacity;

    private java.lang.String maxnetpow;

    private java.lang.String atmin;

    private java.lang.String clutchtype;

    private java.lang.String gearbox;

    private java.lang.String[] gearratio;

    private java.lang.String findrivratio;

    private boolean steermeth;

    private java.lang.String typeofbody;

    private java.lang.String doorsno;

    private java.lang.String seatno;

    private java.lang.String maxspeed;

    private java.lang.String soundstat;

    private java.lang.String sounddrive;

    private java.lang.String co;

    private java.lang.String hc;

    private java.lang.String nox;

    private java.lang.String hcnox;

    private java.lang.String remark;

    private java.lang.String roofload;

    private java.lang.String noofgears;

    private java.lang.String soundatmin;

    private java.lang.String particulates;

    private java.lang.String urban;

    private java.lang.String extraurban;

    private java.lang.String combined;

    private java.lang.String co2;

    private java.lang.String brakedevice;

    private java.lang.String snumber;

    private java.lang.String t_massoftrbr;

    private java.lang.String t_massoftrunbr;

    private is.lt.ws.VehicleRegistryService.Tyre tyre;

    private is.lt.ws.VehicleRegistryService.Size size;

    private is.lt.ws.VehicleRegistryService.Axle axle;

    private is.lt.ws.VehicleRegistryService.Mass mass;

    private java.lang.String priceRange;

    private java.lang.String mainCategory;

    private java.lang.String excemptionCategory;

    private java.lang.String weightedCo2;

    private java.lang.String vehicleSubGroup;

    private java.lang.String standingNo;

    private java.lang.String co2_WLTP;

    private java.lang.String weightedCo2_WLTP;

    public Technical() {
    }

    public Technical(
           is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData,
           java.lang.String vehgroup,
           java.lang.String engine,
           java.lang.String pass,
           java.lang.String passbydr,
           java.lang.String engingemanuf,
           java.lang.String enginecode,
           java.lang.String workingpr,
           java.lang.String directinj,
           java.lang.String nocylinders,
           java.lang.String arrcylinders,
           java.lang.String capacity,
           java.lang.String maxnetpow,
           java.lang.String atmin,
           java.lang.String clutchtype,
           java.lang.String gearbox,
           java.lang.String[] gearratio,
           java.lang.String findrivratio,
           boolean steermeth,
           java.lang.String typeofbody,
           java.lang.String doorsno,
           java.lang.String seatno,
           java.lang.String maxspeed,
           java.lang.String soundstat,
           java.lang.String sounddrive,
           java.lang.String co,
           java.lang.String hc,
           java.lang.String nox,
           java.lang.String hcnox,
           java.lang.String remark,
           java.lang.String roofload,
           java.lang.String noofgears,
           java.lang.String soundatmin,
           java.lang.String particulates,
           java.lang.String urban,
           java.lang.String extraurban,
           java.lang.String combined,
           java.lang.String co2,
           java.lang.String brakedevice,
           java.lang.String snumber,
           java.lang.String t_massoftrbr,
           java.lang.String t_massoftrunbr,
           is.lt.ws.VehicleRegistryService.Tyre tyre,
           is.lt.ws.VehicleRegistryService.Size size,
           is.lt.ws.VehicleRegistryService.Axle axle,
           is.lt.ws.VehicleRegistryService.Mass mass,
           java.lang.String priceRange,
           java.lang.String mainCategory,
           java.lang.String excemptionCategory,
           java.lang.String weightedCo2,
           java.lang.String vehicleSubGroup,
           java.lang.String standingNo,
           java.lang.String co2_WLTP,
           java.lang.String weightedCo2_WLTP) {
           this.extensionData = extensionData;
           this.vehgroup = vehgroup;
           this.engine = engine;
           this.pass = pass;
           this.passbydr = passbydr;
           this.engingemanuf = engingemanuf;
           this.enginecode = enginecode;
           this.workingpr = workingpr;
           this.directinj = directinj;
           this.nocylinders = nocylinders;
           this.arrcylinders = arrcylinders;
           this.capacity = capacity;
           this.maxnetpow = maxnetpow;
           this.atmin = atmin;
           this.clutchtype = clutchtype;
           this.gearbox = gearbox;
           this.gearratio = gearratio;
           this.findrivratio = findrivratio;
           this.steermeth = steermeth;
           this.typeofbody = typeofbody;
           this.doorsno = doorsno;
           this.seatno = seatno;
           this.maxspeed = maxspeed;
           this.soundstat = soundstat;
           this.sounddrive = sounddrive;
           this.co = co;
           this.hc = hc;
           this.nox = nox;
           this.hcnox = hcnox;
           this.remark = remark;
           this.roofload = roofload;
           this.noofgears = noofgears;
           this.soundatmin = soundatmin;
           this.particulates = particulates;
           this.urban = urban;
           this.extraurban = extraurban;
           this.combined = combined;
           this.co2 = co2;
           this.brakedevice = brakedevice;
           this.snumber = snumber;
           this.t_massoftrbr = t_massoftrbr;
           this.t_massoftrunbr = t_massoftrunbr;
           this.tyre = tyre;
           this.size = size;
           this.axle = axle;
           this.mass = mass;
           this.priceRange = priceRange;
           this.mainCategory = mainCategory;
           this.excemptionCategory = excemptionCategory;
           this.weightedCo2 = weightedCo2;
           this.vehicleSubGroup = vehicleSubGroup;
           this.standingNo = standingNo;
           this.co2_WLTP = co2_WLTP;
           this.weightedCo2_WLTP = weightedCo2_WLTP;
    }


    /**
     * Gets the extensionData value for this Technical.
     *
     * @return extensionData
     */
    public is.lt.ws.VehicleRegistryService.ExtensionDataObject getExtensionData() {
        return extensionData;
    }


    /**
     * Sets the extensionData value for this Technical.
     *
     * @param extensionData
     */
    public void setExtensionData(is.lt.ws.VehicleRegistryService.ExtensionDataObject extensionData) {
        this.extensionData = extensionData;
    }


    /**
     * Gets the vehgroup value for this Technical.
     *
     * @return vehgroup
     */
    public java.lang.String getVehgroup() {
        return vehgroup;
    }


    /**
     * Sets the vehgroup value for this Technical.
     *
     * @param vehgroup
     */
    public void setVehgroup(java.lang.String vehgroup) {
        this.vehgroup = vehgroup;
    }


    /**
     * Gets the engine value for this Technical.
     *
     * @return engine
     */
    public java.lang.String getEngine() {
        return engine;
    }


    /**
     * Sets the engine value for this Technical.
     *
     * @param engine
     */
    public void setEngine(java.lang.String engine) {
        this.engine = engine;
    }


    /**
     * Gets the pass value for this Technical.
     *
     * @return pass
     */
    public java.lang.String getPass() {
        return pass;
    }


    /**
     * Sets the pass value for this Technical.
     *
     * @param pass
     */
    public void setPass(java.lang.String pass) {
        this.pass = pass;
    }


    /**
     * Gets the passbydr value for this Technical.
     *
     * @return passbydr
     */
    public java.lang.String getPassbydr() {
        return passbydr;
    }


    /**
     * Sets the passbydr value for this Technical.
     *
     * @param passbydr
     */
    public void setPassbydr(java.lang.String passbydr) {
        this.passbydr = passbydr;
    }


    /**
     * Gets the engingemanuf value for this Technical.
     *
     * @return engingemanuf
     */
    public java.lang.String getEngingemanuf() {
        return engingemanuf;
    }


    /**
     * Sets the engingemanuf value for this Technical.
     *
     * @param engingemanuf
     */
    public void setEngingemanuf(java.lang.String engingemanuf) {
        this.engingemanuf = engingemanuf;
    }


    /**
     * Gets the enginecode value for this Technical.
     *
     * @return enginecode
     */
    public java.lang.String getEnginecode() {
        return enginecode;
    }


    /**
     * Sets the enginecode value for this Technical.
     *
     * @param enginecode
     */
    public void setEnginecode(java.lang.String enginecode) {
        this.enginecode = enginecode;
    }


    /**
     * Gets the workingpr value for this Technical.
     *
     * @return workingpr
     */
    public java.lang.String getWorkingpr() {
        return workingpr;
    }


    /**
     * Sets the workingpr value for this Technical.
     *
     * @param workingpr
     */
    public void setWorkingpr(java.lang.String workingpr) {
        this.workingpr = workingpr;
    }


    /**
     * Gets the directinj value for this Technical.
     *
     * @return directinj
     */
    public java.lang.String getDirectinj() {
        return directinj;
    }


    /**
     * Sets the directinj value for this Technical.
     *
     * @param directinj
     */
    public void setDirectinj(java.lang.String directinj) {
        this.directinj = directinj;
    }


    /**
     * Gets the nocylinders value for this Technical.
     *
     * @return nocylinders
     */
    public java.lang.String getNocylinders() {
        return nocylinders;
    }


    /**
     * Sets the nocylinders value for this Technical.
     *
     * @param nocylinders
     */
    public void setNocylinders(java.lang.String nocylinders) {
        this.nocylinders = nocylinders;
    }


    /**
     * Gets the arrcylinders value for this Technical.
     *
     * @return arrcylinders
     */
    public java.lang.String getArrcylinders() {
        return arrcylinders;
    }


    /**
     * Sets the arrcylinders value for this Technical.
     *
     * @param arrcylinders
     */
    public void setArrcylinders(java.lang.String arrcylinders) {
        this.arrcylinders = arrcylinders;
    }


    /**
     * Gets the capacity value for this Technical.
     *
     * @return capacity
     */
    public java.lang.String getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this Technical.
     *
     * @param capacity
     */
    public void setCapacity(java.lang.String capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the maxnetpow value for this Technical.
     *
     * @return maxnetpow
     */
    public java.lang.String getMaxnetpow() {
        return maxnetpow;
    }


    /**
     * Sets the maxnetpow value for this Technical.
     *
     * @param maxnetpow
     */
    public void setMaxnetpow(java.lang.String maxnetpow) {
        this.maxnetpow = maxnetpow;
    }


    /**
     * Gets the atmin value for this Technical.
     *
     * @return atmin
     */
    public java.lang.String getAtmin() {
        return atmin;
    }


    /**
     * Sets the atmin value for this Technical.
     *
     * @param atmin
     */
    public void setAtmin(java.lang.String atmin) {
        this.atmin = atmin;
    }


    /**
     * Gets the clutchtype value for this Technical.
     *
     * @return clutchtype
     */
    public java.lang.String getClutchtype() {
        return clutchtype;
    }


    /**
     * Sets the clutchtype value for this Technical.
     *
     * @param clutchtype
     */
    public void setClutchtype(java.lang.String clutchtype) {
        this.clutchtype = clutchtype;
    }


    /**
     * Gets the gearbox value for this Technical.
     *
     * @return gearbox
     */
    public java.lang.String getGearbox() {
        return gearbox;
    }


    /**
     * Sets the gearbox value for this Technical.
     *
     * @param gearbox
     */
    public void setGearbox(java.lang.String gearbox) {
        this.gearbox = gearbox;
    }


    /**
     * Gets the gearratio value for this Technical.
     *
     * @return gearratio
     */
    public java.lang.String[] getGearratio() {
        return gearratio;
    }


    /**
     * Sets the gearratio value for this Technical.
     *
     * @param gearratio
     */
    public void setGearratio(java.lang.String[] gearratio) {
        this.gearratio = gearratio;
    }


    /**
     * Gets the findrivratio value for this Technical.
     *
     * @return findrivratio
     */
    public java.lang.String getFindrivratio() {
        return findrivratio;
    }


    /**
     * Sets the findrivratio value for this Technical.
     *
     * @param findrivratio
     */
    public void setFindrivratio(java.lang.String findrivratio) {
        this.findrivratio = findrivratio;
    }


    /**
     * Gets the steermeth value for this Technical.
     *
     * @return steermeth
     */
    public boolean isSteermeth() {
        return steermeth;
    }


    /**
     * Sets the steermeth value for this Technical.
     *
     * @param steermeth
     */
    public void setSteermeth(boolean steermeth) {
        this.steermeth = steermeth;
    }


    /**
     * Gets the typeofbody value for this Technical.
     *
     * @return typeofbody
     */
    public java.lang.String getTypeofbody() {
        return typeofbody;
    }


    /**
     * Sets the typeofbody value for this Technical.
     *
     * @param typeofbody
     */
    public void setTypeofbody(java.lang.String typeofbody) {
        this.typeofbody = typeofbody;
    }


    /**
     * Gets the doorsno value for this Technical.
     *
     * @return doorsno
     */
    public java.lang.String getDoorsno() {
        return doorsno;
    }


    /**
     * Sets the doorsno value for this Technical.
     *
     * @param doorsno
     */
    public void setDoorsno(java.lang.String doorsno) {
        this.doorsno = doorsno;
    }


    /**
     * Gets the seatno value for this Technical.
     *
     * @return seatno
     */
    public java.lang.String getSeatno() {
        return seatno;
    }


    /**
     * Sets the seatno value for this Technical.
     *
     * @param seatno
     */
    public void setSeatno(java.lang.String seatno) {
        this.seatno = seatno;
    }


    /**
     * Gets the maxspeed value for this Technical.
     *
     * @return maxspeed
     */
    public java.lang.String getMaxspeed() {
        return maxspeed;
    }


    /**
     * Sets the maxspeed value for this Technical.
     *
     * @param maxspeed
     */
    public void setMaxspeed(java.lang.String maxspeed) {
        this.maxspeed = maxspeed;
    }


    /**
     * Gets the soundstat value for this Technical.
     *
     * @return soundstat
     */
    public java.lang.String getSoundstat() {
        return soundstat;
    }


    /**
     * Sets the soundstat value for this Technical.
     *
     * @param soundstat
     */
    public void setSoundstat(java.lang.String soundstat) {
        this.soundstat = soundstat;
    }


    /**
     * Gets the sounddrive value for this Technical.
     *
     * @return sounddrive
     */
    public java.lang.String getSounddrive() {
        return sounddrive;
    }


    /**
     * Sets the sounddrive value for this Technical.
     *
     * @param sounddrive
     */
    public void setSounddrive(java.lang.String sounddrive) {
        this.sounddrive = sounddrive;
    }


    /**
     * Gets the co value for this Technical.
     *
     * @return co
     */
    public java.lang.String getCo() {
        return co;
    }


    /**
     * Sets the co value for this Technical.
     *
     * @param co
     */
    public void setCo(java.lang.String co) {
        this.co = co;
    }


    /**
     * Gets the hc value for this Technical.
     *
     * @return hc
     */
    public java.lang.String getHc() {
        return hc;
    }


    /**
     * Sets the hc value for this Technical.
     *
     * @param hc
     */
    public void setHc(java.lang.String hc) {
        this.hc = hc;
    }


    /**
     * Gets the nox value for this Technical.
     *
     * @return nox
     */
    public java.lang.String getNox() {
        return nox;
    }


    /**
     * Sets the nox value for this Technical.
     *
     * @param nox
     */
    public void setNox(java.lang.String nox) {
        this.nox = nox;
    }


    /**
     * Gets the hcnox value for this Technical.
     *
     * @return hcnox
     */
    public java.lang.String getHcnox() {
        return hcnox;
    }


    /**
     * Sets the hcnox value for this Technical.
     *
     * @param hcnox
     */
    public void setHcnox(java.lang.String hcnox) {
        this.hcnox = hcnox;
    }


    /**
     * Gets the remark value for this Technical.
     *
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this Technical.
     *
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the roofload value for this Technical.
     *
     * @return roofload
     */
    public java.lang.String getRoofload() {
        return roofload;
    }


    /**
     * Sets the roofload value for this Technical.
     *
     * @param roofload
     */
    public void setRoofload(java.lang.String roofload) {
        this.roofload = roofload;
    }


    /**
     * Gets the noofgears value for this Technical.
     *
     * @return noofgears
     */
    public java.lang.String getNoofgears() {
        return noofgears;
    }


    /**
     * Sets the noofgears value for this Technical.
     *
     * @param noofgears
     */
    public void setNoofgears(java.lang.String noofgears) {
        this.noofgears = noofgears;
    }


    /**
     * Gets the soundatmin value for this Technical.
     *
     * @return soundatmin
     */
    public java.lang.String getSoundatmin() {
        return soundatmin;
    }


    /**
     * Sets the soundatmin value for this Technical.
     *
     * @param soundatmin
     */
    public void setSoundatmin(java.lang.String soundatmin) {
        this.soundatmin = soundatmin;
    }


    /**
     * Gets the particulates value for this Technical.
     *
     * @return particulates
     */
    public java.lang.String getParticulates() {
        return particulates;
    }


    /**
     * Sets the particulates value for this Technical.
     *
     * @param particulates
     */
    public void setParticulates(java.lang.String particulates) {
        this.particulates = particulates;
    }


    /**
     * Gets the urban value for this Technical.
     *
     * @return urban
     */
    public java.lang.String getUrban() {
        return urban;
    }


    /**
     * Sets the urban value for this Technical.
     *
     * @param urban
     */
    public void setUrban(java.lang.String urban) {
        this.urban = urban;
    }


    /**
     * Gets the extraurban value for this Technical.
     *
     * @return extraurban
     */
    public java.lang.String getExtraurban() {
        return extraurban;
    }


    /**
     * Sets the extraurban value for this Technical.
     *
     * @param extraurban
     */
    public void setExtraurban(java.lang.String extraurban) {
        this.extraurban = extraurban;
    }


    /**
     * Gets the combined value for this Technical.
     *
     * @return combined
     */
    public java.lang.String getCombined() {
        return combined;
    }


    /**
     * Sets the combined value for this Technical.
     *
     * @param combined
     */
    public void setCombined(java.lang.String combined) {
        this.combined = combined;
    }


    /**
     * Gets the co2 value for this Technical.
     *
     * @return co2
     */
    public java.lang.String getCo2() {
        return co2;
    }


    /**
     * Sets the co2 value for this Technical.
     *
     * @param co2
     */
    public void setCo2(java.lang.String co2) {
        this.co2 = co2;
    }


    /**
     * Gets the brakedevice value for this Technical.
     *
     * @return brakedevice
     */
    public java.lang.String getBrakedevice() {
        return brakedevice;
    }


    /**
     * Sets the brakedevice value for this Technical.
     *
     * @param brakedevice
     */
    public void setBrakedevice(java.lang.String brakedevice) {
        this.brakedevice = brakedevice;
    }


    /**
     * Gets the snumber value for this Technical.
     *
     * @return snumber
     */
    public java.lang.String getSnumber() {
        return snumber;
    }


    /**
     * Sets the snumber value for this Technical.
     *
     * @param snumber
     */
    public void setSnumber(java.lang.String snumber) {
        this.snumber = snumber;
    }


    /**
     * Gets the t_massoftrbr value for this Technical.
     *
     * @return t_massoftrbr
     */
    public java.lang.String getT_massoftrbr() {
        return t_massoftrbr;
    }


    /**
     * Sets the t_massoftrbr value for this Technical.
     *
     * @param t_massoftrbr
     */
    public void setT_massoftrbr(java.lang.String t_massoftrbr) {
        this.t_massoftrbr = t_massoftrbr;
    }


    /**
     * Gets the t_massoftrunbr value for this Technical.
     *
     * @return t_massoftrunbr
     */
    public java.lang.String getT_massoftrunbr() {
        return t_massoftrunbr;
    }


    /**
     * Sets the t_massoftrunbr value for this Technical.
     *
     * @param t_massoftrunbr
     */
    public void setT_massoftrunbr(java.lang.String t_massoftrunbr) {
        this.t_massoftrunbr = t_massoftrunbr;
    }


    /**
     * Gets the tyre value for this Technical.
     *
     * @return tyre
     */
    public is.lt.ws.VehicleRegistryService.Tyre getTyre() {
        return tyre;
    }


    /**
     * Sets the tyre value for this Technical.
     *
     * @param tyre
     */
    public void setTyre(is.lt.ws.VehicleRegistryService.Tyre tyre) {
        this.tyre = tyre;
    }


    /**
     * Gets the size value for this Technical.
     *
     * @return size
     */
    public is.lt.ws.VehicleRegistryService.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this Technical.
     *
     * @param size
     */
    public void setSize(is.lt.ws.VehicleRegistryService.Size size) {
        this.size = size;
    }


    /**
     * Gets the axle value for this Technical.
     *
     * @return axle
     */
    public is.lt.ws.VehicleRegistryService.Axle getAxle() {
        return axle;
    }


    /**
     * Sets the axle value for this Technical.
     *
     * @param axle
     */
    public void setAxle(is.lt.ws.VehicleRegistryService.Axle axle) {
        this.axle = axle;
    }


    /**
     * Gets the mass value for this Technical.
     *
     * @return mass
     */
    public is.lt.ws.VehicleRegistryService.Mass getMass() {
        return mass;
    }


    /**
     * Sets the mass value for this Technical.
     *
     * @param mass
     */
    public void setMass(is.lt.ws.VehicleRegistryService.Mass mass) {
        this.mass = mass;
    }


    /**
     * Gets the priceRange value for this Technical.
     *
     * @return priceRange
     */
    public java.lang.String getPriceRange() {
        return priceRange;
    }


    /**
     * Sets the priceRange value for this Technical.
     *
     * @param priceRange
     */
    public void setPriceRange(java.lang.String priceRange) {
        this.priceRange = priceRange;
    }


    /**
     * Gets the mainCategory value for this Technical.
     *
     * @return mainCategory
     */
    public java.lang.String getMainCategory() {
        return mainCategory;
    }


    /**
     * Sets the mainCategory value for this Technical.
     *
     * @param mainCategory
     */
    public void setMainCategory(java.lang.String mainCategory) {
        this.mainCategory = mainCategory;
    }


    /**
     * Gets the excemptionCategory value for this Technical.
     *
     * @return excemptionCategory
     */
    public java.lang.String getExcemptionCategory() {
        return excemptionCategory;
    }


    /**
     * Sets the excemptionCategory value for this Technical.
     *
     * @param excemptionCategory
     */
    public void setExcemptionCategory(java.lang.String excemptionCategory) {
        this.excemptionCategory = excemptionCategory;
    }


    /**
     * Gets the weightedCo2 value for this Technical.
     *
     * @return weightedCo2
     */
    public java.lang.String getWeightedCo2() {
        return weightedCo2;
    }


    /**
     * Sets the weightedCo2 value for this Technical.
     *
     * @param weightedCo2
     */
    public void setWeightedCo2(java.lang.String weightedCo2) {
        this.weightedCo2 = weightedCo2;
    }


    /**
     * Gets the vehicleSubGroup value for this Technical.
     *
     * @return vehicleSubGroup
     */
    public java.lang.String getVehicleSubGroup() {
        return vehicleSubGroup;
    }


    /**
     * Sets the vehicleSubGroup value for this Technical.
     *
     * @param vehicleSubGroup
     */
    public void setVehicleSubGroup(java.lang.String vehicleSubGroup) {
        this.vehicleSubGroup = vehicleSubGroup;
    }


    /**
     * Gets the standingNo value for this Technical.
     *
     * @return standingNo
     */
    public java.lang.String getStandingNo() {
        return standingNo;
    }


    /**
     * Sets the standingNo value for this Technical.
     *
     * @param standingNo
     */
    public void setStandingNo(java.lang.String standingNo) {
        this.standingNo = standingNo;
    }


    /**
     * Gets the co2_WLTP value for this Technical.
     *
     * @return co2_WLTP
     */
    public java.lang.String getCo2_WLTP() {
        return co2_WLTP;
    }


    /**
     * Sets the co2_WLTP value for this Technical.
     *
     * @param co2_WLTP
     */
    public void setCo2_WLTP(java.lang.String co2_WLTP) {
        this.co2_WLTP = co2_WLTP;
    }


    /**
     * Gets the weightedCo2_WLTP value for this Technical.
     *
     * @return weightedCo2_WLTP
     */
    public java.lang.String getWeightedCo2_WLTP() {
        return weightedCo2_WLTP;
    }


    /**
     * Sets the weightedCo2_WLTP value for this Technical.
     *
     * @param weightedCo2_WLTP
     */
    public void setWeightedCo2_WLTP(java.lang.String weightedCo2_WLTP) {
        this.weightedCo2_WLTP = weightedCo2_WLTP;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Technical)) return false;
        Technical other = (Technical) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.extensionData==null && other.getExtensionData()==null) ||
             (this.extensionData!=null &&
              this.extensionData.equals(other.getExtensionData()))) &&
            ((this.vehgroup==null && other.getVehgroup()==null) ||
             (this.vehgroup!=null &&
              this.vehgroup.equals(other.getVehgroup()))) &&
            ((this.engine==null && other.getEngine()==null) ||
             (this.engine!=null &&
              this.engine.equals(other.getEngine()))) &&
            ((this.pass==null && other.getPass()==null) ||
             (this.pass!=null &&
              this.pass.equals(other.getPass()))) &&
            ((this.passbydr==null && other.getPassbydr()==null) ||
             (this.passbydr!=null &&
              this.passbydr.equals(other.getPassbydr()))) &&
            ((this.engingemanuf==null && other.getEngingemanuf()==null) ||
             (this.engingemanuf!=null &&
              this.engingemanuf.equals(other.getEngingemanuf()))) &&
            ((this.enginecode==null && other.getEnginecode()==null) ||
             (this.enginecode!=null &&
              this.enginecode.equals(other.getEnginecode()))) &&
            ((this.workingpr==null && other.getWorkingpr()==null) ||
             (this.workingpr!=null &&
              this.workingpr.equals(other.getWorkingpr()))) &&
            ((this.directinj==null && other.getDirectinj()==null) ||
             (this.directinj!=null &&
              this.directinj.equals(other.getDirectinj()))) &&
            ((this.nocylinders==null && other.getNocylinders()==null) ||
             (this.nocylinders!=null &&
              this.nocylinders.equals(other.getNocylinders()))) &&
            ((this.arrcylinders==null && other.getArrcylinders()==null) ||
             (this.arrcylinders!=null &&
              this.arrcylinders.equals(other.getArrcylinders()))) &&
            ((this.capacity==null && other.getCapacity()==null) ||
             (this.capacity!=null &&
              this.capacity.equals(other.getCapacity()))) &&
            ((this.maxnetpow==null && other.getMaxnetpow()==null) ||
             (this.maxnetpow!=null &&
              this.maxnetpow.equals(other.getMaxnetpow()))) &&
            ((this.atmin==null && other.getAtmin()==null) ||
             (this.atmin!=null &&
              this.atmin.equals(other.getAtmin()))) &&
            ((this.clutchtype==null && other.getClutchtype()==null) ||
             (this.clutchtype!=null &&
              this.clutchtype.equals(other.getClutchtype()))) &&
            ((this.gearbox==null && other.getGearbox()==null) ||
             (this.gearbox!=null &&
              this.gearbox.equals(other.getGearbox()))) &&
            ((this.gearratio==null && other.getGearratio()==null) ||
             (this.gearratio!=null &&
              java.util.Arrays.equals(this.gearratio, other.getGearratio()))) &&
            ((this.findrivratio==null && other.getFindrivratio()==null) ||
             (this.findrivratio!=null &&
              this.findrivratio.equals(other.getFindrivratio()))) &&
            this.steermeth == other.isSteermeth() &&
            ((this.typeofbody==null && other.getTypeofbody()==null) ||
             (this.typeofbody!=null &&
              this.typeofbody.equals(other.getTypeofbody()))) &&
            ((this.doorsno==null && other.getDoorsno()==null) ||
             (this.doorsno!=null &&
              this.doorsno.equals(other.getDoorsno()))) &&
            ((this.seatno==null && other.getSeatno()==null) ||
             (this.seatno!=null &&
              this.seatno.equals(other.getSeatno()))) &&
            ((this.maxspeed==null && other.getMaxspeed()==null) ||
             (this.maxspeed!=null &&
              this.maxspeed.equals(other.getMaxspeed()))) &&
            ((this.soundstat==null && other.getSoundstat()==null) ||
             (this.soundstat!=null &&
              this.soundstat.equals(other.getSoundstat()))) &&
            ((this.sounddrive==null && other.getSounddrive()==null) ||
             (this.sounddrive!=null &&
              this.sounddrive.equals(other.getSounddrive()))) &&
            ((this.co==null && other.getCo()==null) ||
             (this.co!=null &&
              this.co.equals(other.getCo()))) &&
            ((this.hc==null && other.getHc()==null) ||
             (this.hc!=null &&
              this.hc.equals(other.getHc()))) &&
            ((this.nox==null && other.getNox()==null) ||
             (this.nox!=null &&
              this.nox.equals(other.getNox()))) &&
            ((this.hcnox==null && other.getHcnox()==null) ||
             (this.hcnox!=null &&
              this.hcnox.equals(other.getHcnox()))) &&
            ((this.remark==null && other.getRemark()==null) ||
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.roofload==null && other.getRoofload()==null) ||
             (this.roofload!=null &&
              this.roofload.equals(other.getRoofload()))) &&
            ((this.noofgears==null && other.getNoofgears()==null) ||
             (this.noofgears!=null &&
              this.noofgears.equals(other.getNoofgears()))) &&
            ((this.soundatmin==null && other.getSoundatmin()==null) ||
             (this.soundatmin!=null &&
              this.soundatmin.equals(other.getSoundatmin()))) &&
            ((this.particulates==null && other.getParticulates()==null) ||
             (this.particulates!=null &&
              this.particulates.equals(other.getParticulates()))) &&
            ((this.urban==null && other.getUrban()==null) ||
             (this.urban!=null &&
              this.urban.equals(other.getUrban()))) &&
            ((this.extraurban==null && other.getExtraurban()==null) ||
             (this.extraurban!=null &&
              this.extraurban.equals(other.getExtraurban()))) &&
            ((this.combined==null && other.getCombined()==null) ||
             (this.combined!=null &&
              this.combined.equals(other.getCombined()))) &&
            ((this.co2==null && other.getCo2()==null) ||
             (this.co2!=null &&
              this.co2.equals(other.getCo2()))) &&
            ((this.brakedevice==null && other.getBrakedevice()==null) ||
             (this.brakedevice!=null &&
              this.brakedevice.equals(other.getBrakedevice()))) &&
            ((this.snumber==null && other.getSnumber()==null) ||
             (this.snumber!=null &&
              this.snumber.equals(other.getSnumber()))) &&
            ((this.t_massoftrbr==null && other.getT_massoftrbr()==null) ||
             (this.t_massoftrbr!=null &&
              this.t_massoftrbr.equals(other.getT_massoftrbr()))) &&
            ((this.t_massoftrunbr==null && other.getT_massoftrunbr()==null) ||
             (this.t_massoftrunbr!=null &&
              this.t_massoftrunbr.equals(other.getT_massoftrunbr()))) &&
            ((this.tyre==null && other.getTyre()==null) ||
             (this.tyre!=null &&
              this.tyre.equals(other.getTyre()))) &&
            ((this.size==null && other.getSize()==null) ||
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.axle==null && other.getAxle()==null) ||
             (this.axle!=null &&
              this.axle.equals(other.getAxle()))) &&
            ((this.mass==null && other.getMass()==null) ||
             (this.mass!=null &&
              this.mass.equals(other.getMass()))) &&
            ((this.priceRange==null && other.getPriceRange()==null) ||
             (this.priceRange!=null &&
              this.priceRange.equals(other.getPriceRange()))) &&
            ((this.mainCategory==null && other.getMainCategory()==null) ||
             (this.mainCategory!=null &&
              this.mainCategory.equals(other.getMainCategory()))) &&
            ((this.excemptionCategory==null && other.getExcemptionCategory()==null) ||
             (this.excemptionCategory!=null &&
              this.excemptionCategory.equals(other.getExcemptionCategory()))) &&
            ((this.weightedCo2==null && other.getWeightedCo2()==null) ||
             (this.weightedCo2!=null &&
              this.weightedCo2.equals(other.getWeightedCo2()))) &&
            ((this.vehicleSubGroup==null && other.getVehicleSubGroup()==null) ||
             (this.vehicleSubGroup!=null &&
              this.vehicleSubGroup.equals(other.getVehicleSubGroup()))) &&
            ((this.standingNo==null && other.getStandingNo()==null) ||
             (this.standingNo!=null &&
              this.standingNo.equals(other.getStandingNo()))) &&
            ((this.co2_WLTP==null && other.getCo2_WLTP()==null) ||
             (this.co2_WLTP!=null &&
              this.co2_WLTP.equals(other.getCo2_WLTP()))) &&
            ((this.weightedCo2_WLTP==null && other.getWeightedCo2_WLTP()==null) ||
             (this.weightedCo2_WLTP!=null &&
              this.weightedCo2_WLTP.equals(other.getWeightedCo2_WLTP())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    @Override
	public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getExtensionData() != null) {
            _hashCode += getExtensionData().hashCode();
        }
        if (getVehgroup() != null) {
            _hashCode += getVehgroup().hashCode();
        }
        if (getEngine() != null) {
            _hashCode += getEngine().hashCode();
        }
        if (getPass() != null) {
            _hashCode += getPass().hashCode();
        }
        if (getPassbydr() != null) {
            _hashCode += getPassbydr().hashCode();
        }
        if (getEngingemanuf() != null) {
            _hashCode += getEngingemanuf().hashCode();
        }
        if (getEnginecode() != null) {
            _hashCode += getEnginecode().hashCode();
        }
        if (getWorkingpr() != null) {
            _hashCode += getWorkingpr().hashCode();
        }
        if (getDirectinj() != null) {
            _hashCode += getDirectinj().hashCode();
        }
        if (getNocylinders() != null) {
            _hashCode += getNocylinders().hashCode();
        }
        if (getArrcylinders() != null) {
            _hashCode += getArrcylinders().hashCode();
        }
        if (getCapacity() != null) {
            _hashCode += getCapacity().hashCode();
        }
        if (getMaxnetpow() != null) {
            _hashCode += getMaxnetpow().hashCode();
        }
        if (getAtmin() != null) {
            _hashCode += getAtmin().hashCode();
        }
        if (getClutchtype() != null) {
            _hashCode += getClutchtype().hashCode();
        }
        if (getGearbox() != null) {
            _hashCode += getGearbox().hashCode();
        }
        if (getGearratio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGearratio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGearratio(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFindrivratio() != null) {
            _hashCode += getFindrivratio().hashCode();
        }
        _hashCode += (isSteermeth() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTypeofbody() != null) {
            _hashCode += getTypeofbody().hashCode();
        }
        if (getDoorsno() != null) {
            _hashCode += getDoorsno().hashCode();
        }
        if (getSeatno() != null) {
            _hashCode += getSeatno().hashCode();
        }
        if (getMaxspeed() != null) {
            _hashCode += getMaxspeed().hashCode();
        }
        if (getSoundstat() != null) {
            _hashCode += getSoundstat().hashCode();
        }
        if (getSounddrive() != null) {
            _hashCode += getSounddrive().hashCode();
        }
        if (getCo() != null) {
            _hashCode += getCo().hashCode();
        }
        if (getHc() != null) {
            _hashCode += getHc().hashCode();
        }
        if (getNox() != null) {
            _hashCode += getNox().hashCode();
        }
        if (getHcnox() != null) {
            _hashCode += getHcnox().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getRoofload() != null) {
            _hashCode += getRoofload().hashCode();
        }
        if (getNoofgears() != null) {
            _hashCode += getNoofgears().hashCode();
        }
        if (getSoundatmin() != null) {
            _hashCode += getSoundatmin().hashCode();
        }
        if (getParticulates() != null) {
            _hashCode += getParticulates().hashCode();
        }
        if (getUrban() != null) {
            _hashCode += getUrban().hashCode();
        }
        if (getExtraurban() != null) {
            _hashCode += getExtraurban().hashCode();
        }
        if (getCombined() != null) {
            _hashCode += getCombined().hashCode();
        }
        if (getCo2() != null) {
            _hashCode += getCo2().hashCode();
        }
        if (getBrakedevice() != null) {
            _hashCode += getBrakedevice().hashCode();
        }
        if (getSnumber() != null) {
            _hashCode += getSnumber().hashCode();
        }
        if (getT_massoftrbr() != null) {
            _hashCode += getT_massoftrbr().hashCode();
        }
        if (getT_massoftrunbr() != null) {
            _hashCode += getT_massoftrunbr().hashCode();
        }
        if (getTyre() != null) {
            _hashCode += getTyre().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getAxle() != null) {
            _hashCode += getAxle().hashCode();
        }
        if (getMass() != null) {
            _hashCode += getMass().hashCode();
        }
        if (getPriceRange() != null) {
            _hashCode += getPriceRange().hashCode();
        }
        if (getMainCategory() != null) {
            _hashCode += getMainCategory().hashCode();
        }
        if (getExcemptionCategory() != null) {
            _hashCode += getExcemptionCategory().hashCode();
        }
        if (getWeightedCo2() != null) {
            _hashCode += getWeightedCo2().hashCode();
        }
        if (getVehicleSubGroup() != null) {
            _hashCode += getVehicleSubGroup().hashCode();
        }
        if (getStandingNo() != null) {
            _hashCode += getStandingNo().hashCode();
        }
        if (getCo2_WLTP() != null) {
            _hashCode += getCo2_WLTP().hashCode();
        }
        if (getWeightedCo2_WLTP() != null) {
            _hashCode += getWeightedCo2_WLTP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Technical.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Technical"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExtensionDataObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Vehgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engine");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Engine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pass");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Pass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passbydr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Passbydr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engingemanuf");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Engingemanuf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enginecode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Enginecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workingpr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Workingpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directinj");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Directinj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nocylinders");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Nocylinders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrcylinders");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Arrcylinders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxnetpow");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Maxnetpow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atmin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Atmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clutchtype");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Clutchtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gearbox");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Gearbox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gearratio");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Gearratio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findrivratio");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Findrivratio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steermeth");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Steermeth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeofbody");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Typeofbody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doorsno");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Doorsno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatno");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Seatno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxspeed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Maxspeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soundstat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Soundstat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sounddrive");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Sounddrive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("co");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Co"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Hc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nox");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Nox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hcnox");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Hcnox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roofload");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Roofload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noofgears");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Noofgears"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soundatmin");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Soundatmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("particulates");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Particulates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urban");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Urban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraurban");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Extraurban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("combined");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Combined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("co2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Co2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brakedevice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Brakedevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Snumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("t_massoftrbr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "T_massoftrbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("t_massoftrunbr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "T_massoftrunbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tyre");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Tyre"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Tyre"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Size"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("axle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Axle"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Axle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mass");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Mass"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Mass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "PriceRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "MainCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excemptionCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "ExcemptionCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightedCo2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "WeightedCo2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleSubGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "VehicleSubGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standingNo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "StandingNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("co2_WLTP");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "Co2_WLTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightedCo2_WLTP");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.lt.is/VehicleRegistryService", "WeightedCo2_WLTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType,
           java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType,
           java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
