package pokemon;

public class Pokemon {
    private String name, nickname = null;
    private int lvl, weekness, type, status = 0, statusRounds = 0 ;
    private boolean canAttack = true;

    public float life, attack, deffense;

    public Pokemon(String name, int lvl, float life, int attack, int deffense, int type, int weekness){
        this.name = name;
        this.lvl = lvl;
        this.life = life;
        this.attack = attack;
        this.deffense = deffense;
        this.type = type;
        this.weekness = weekness;
    }
    public Pokemon(String name, int lvl, float life, int attack, int deffense, int type, int weekness, String nickname){
        this.name = name;
        this.lvl = lvl;
        this.life = life;
        this.attack = attack;
        this.deffense = deffense;
        this.type = type;
        this.weekness = weekness;
        this.nickname = nickname;
    }
    public String getName(){
        if(this.nickname != null) return this.nickname;
        else return this.name;
    }
    public float getLife(){
        return this.life;
    }
    public void takeDamage(Pokemon atacant){
        if(atacant.canAttack) this.life -= atacant.attack;
    }
    public void checkStatus(){
        if(this.status != 0 && this.statusRounds != 0){
            switch(this.status){
                case 1:
                    this.life -= 7;
                    this.canAttack = true;
                    break;
                case 2:
                    this.life -= this.attack;
                    this.canAttack = false;
                    break;
                case 3:
                    this.canAttack = false;
                    break;
            }
            this.statusRounds--;
        }
        if(this.statusRounds == 0){
            this.status = 0;
            this.canAttack = true;
        }
    }
    public void setStatus(int status){
        this.status = status;
        switch(status){
            case 1:
                statusRounds = 3;
                break;
            case 2:
                statusRounds = 2;
                break;
            case 3:
                statusRounds = 3;
                break;
        }
    }
} 
