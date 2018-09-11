package curiosense.ngo_application.models;

public class Food {
    public static final String TABLE_NAME = "food_data";

    public static final String COLUMN_SRNO = "srno";
    public static final String COLUMN_FOODGROUP = "foodgroup";
    public static final String COLUMN_FOODITEM = "fooditem";
    public static final String COLUMN_FOODUNIT = "foodunit";
    public static final String COLUMN_CALORIES = "calories";
    public static final String COLUMN_PROTEINS = "proteins";
    public static final String COLUMN_FAT = "fat";
    public static final String COLUMN_CARBOHYDRATES = "carbohydrates";
    public static final String COLUMN_CAlCIUM = "calcium";
    public static final String COLUMN_SODIUM = "sodium";
    public static final String COLUMN_POTASSIUM = "potassium";
    public static final String COLUMN_VITAMIN_C = "vitamin_c";
    public static final String COLUMN_RIBOFALVIN = "ribofalvin";
    public static final String COLUMN_BETACAROTINE = "betacarotine";
    public static final String COLUMN_FOLICACID = "folicacid";
    public static final String COLUMN_ZINC = "zinc";
    public static final String COLUMN_IRON = "iron";
    public static final String COLUMN_PHOSPHOROUS = "phosphorous";
    public static final String COLUMN_MAGNESIUM = "magnesium";
    public static final String COLUMN_MANGENESE = "mangenese";
    public static final String COLUMN_THIAMIN = "thiamin";
    public static final String COLUMN_COPPER = "copper";
    public static final String COLUMN_NIACIN = "niacin";
    public static final String COLUMN_PHYTATES = "phytates";
    public static final String COLUMN_FIBER = "fiber";

    private int srno, calories;
    private String foodGroup, foodItem, foodUnit;
    private float pro, fat, car, cal, sod, pot, vit, rib, bet, fol, zin, iro, pho, mag, man, thi, cop, nia, phy, fib;

    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_SRNO + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_FOODGROUP + " TEXT,"
                    + COLUMN_FOODITEM + " TEXT,"
                    + COLUMN_FOODUNIT + " TEXT,"
                    + COLUMN_CALORIES + " INTEGER,"
                    + COLUMN_PROTEINS + " FLOAT,"
                    + COLUMN_FAT + " FLOAT,"
                    + COLUMN_CARBOHYDRATES + " FLOAT,"
                    + COLUMN_CAlCIUM + " FLOAT,"
                    + COLUMN_SODIUM + " FLOAT,"
                    + COLUMN_POTASSIUM + " FLOAT,"
                    + COLUMN_VITAMIN_C + " FLOAT,"
                    + COLUMN_RIBOFALVIN + " FLOAT,"
                    + COLUMN_BETACAROTINE + " REAL,"
                    + COLUMN_FOLICACID + " FLOAT,"
                    + COLUMN_ZINC + " FLOAT,"
                    + COLUMN_IRON + " FLOAT,"
                    + COLUMN_PHOSPHOROUS +  " FLOAT,"
                    + COLUMN_MAGNESIUM + " FLOAT,"
                    + COLUMN_MANGENESE + " FLOAT,"
                    + COLUMN_THIAMIN + " FLOAT,"
                    + COLUMN_COPPER + " FLOAT,"
                    + COLUMN_NIACIN + " FLOAT,"
                    + COLUMN_PHYTATES + " FLOAT,"
                    + COLUMN_FIBER + " FLOAT"
                    + ")";

    public Food() {
    }

    public Food(int srno, String foodGroup, String foodItem, String foodUnit, int calories, float pro, float fat, float car, float cal, float sod,
                float pot, float vit, float rib, float bet, float fol, float zin, float iro, float pho, float mag, float man, float thi, float cop, float nia,
                float phy, float fib) {
        this.srno = srno;
        this.foodGroup = foodGroup;
        this.foodItem = foodItem;
        this.foodUnit = foodUnit;
        this.calories = calories;
        this.pro = pro;
        this.fat = fat;
        this.car = car;
        this.cal = cal;
        this.sod = sod;
        this.pot = pot;
        this.vit = vit;
        this.rib = rib;
        this.bet = bet;
        this.fol = fol;
        this.man = man;
        this.zin = zin;
        this.iro = iro;
        this.pho = pho;
        this.mag = mag;
        this.thi = thi;
        this.cop = cop;
        this.nia = nia;
        this.phy = phy;
        this.fib = fib;
    }

    public int getSrno() {
        return srno;
    }

    public void setSrno(int srno) {
        this.srno = srno;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getFoodGroup() {
        return foodGroup;
    }

    public void setFoodGroup(String foodGroup) {
        this.foodGroup = foodGroup;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public String getFoodUnit() {
        return foodUnit;
    }

    public void setFoodUnit(String foodUnit) {
        this.foodUnit = foodUnit;
    }

    public float getPro() {
        return pro;
    }

    public void setPro(float pro) {
        this.pro = pro;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getCar() {
        return car;
    }

    public void setCar(float car) {
        this.car = car;
    }

    public float getCal() {
        return cal;
    }

    public void setCal(float cal) {
        this.cal = cal;
    }

    public float getSod() {
        return sod;
    }

    public void setSod(float sod) {
        this.sod = sod;
    }

    public float getPot() {
        return pot;
    }

    public void setPot(float pot) {
        this.pot = pot;
    }

    public float getVit() {
        return vit;
    }

    public void setVit(float vit) {
        this.vit = vit;
    }

    public float getRib() {
        return rib;
    }

    public void setRib(float rib) {
        this.rib = rib;
    }

    public float getBet() {
        return bet;
    }

    public void setBet(float bet) {
        this.bet = bet;
    }

    public float getFol() {
        return fol;
    }

    public void setFol(float fol) {
        this.fol = fol;
    }

    public float getZin() {
        return zin;
    }

    public void setZin(float zin) {
        this.zin = zin;
    }

    public float getIro() {
        return iro;
    }

    public void setIro(float iro) {
        this.iro = iro;
    }

    public float getPho() {
        return pho;
    }

    public void setPho(float pho) {
        this.pho = pho;
    }

    public float getMan() {
        return man;
    }

    public void setMan(float man) {
        this.man = man;
    }

    public float getMag() {
        return mag;
    }

    public void setMag(float mag) {
        this.mag = mag;
    }

    public float getThi() {
        return thi;
    }

    public void setThi(float thi) {
        this.thi = thi;
    }

    public float getCop() {
        return cop;
    }

    public void setCop(float cop) {
        this.cop = cop;
    }

    public float getNia() {
        return nia;
    }

    public void setNia(float nia) {
        this.nia = nia;
    }

    public float getPhy() {
        return phy;
    }

    public void setPhy(float phy) {
        this.phy = phy;
    }

    public float getFib() {
        return fib;
    }

    public void setFib(float fib) {
        this.fib = fib;
    }
}
