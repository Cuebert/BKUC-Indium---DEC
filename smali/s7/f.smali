.class public Ls7/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ls7/f;",
            ">;"
        }
    .end annotation
.end field

.field public static d:Ls7/f;

.field public static e:Ls7/f;

.field public static f:Ls7/f;

.field public static g:Ls7/f;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ls7/f;

    const-string v1, "en_us"

    const-string v2, "en"

    invoke-direct {v0, v1, v2}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ls7/f;->d:Ls7/f;

    .line 2
    new-instance v0, Ls7/f;

    const-string v1, "es_es"

    const-string v2, "es"

    invoke-direct {v0, v1, v2}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ls7/f;->e:Ls7/f;

    .line 3
    new-instance v0, Ls7/f;

    const-string v1, "fr_fr"

    const-string v2, "fr"

    invoke-direct {v0, v1, v2}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ls7/f;->f:Ls7/f;

    .line 4
    new-instance v0, Ls7/f;

    const-string v1, "it_it"

    const-string v2, "it"

    invoke-direct {v0, v1, v2}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ls7/f;->g:Ls7/f;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    .line 6
    sget-object v1, Ls7/f;->d:Ls7/f;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    sget-object v1, Ls7/f;->e:Ls7/f;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    sget-object v1, Ls7/f;->f:Ls7/f;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    sget-object v1, Ls7/f;->g:Ls7/f;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    new-instance v1, Ls7/f;

    const-string v2, "de_de"

    const-string v3, "de"

    invoke-direct {v1, v2, v3}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    new-instance v1, Ls7/f;

    const-string v2, "id_id"

    const-string v3, "id"

    invoke-direct {v1, v2, v3}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    new-instance v1, Ls7/f;

    const-string v2, "ja_jp"

    const-string v3, "ja"

    invoke-direct {v1, v2, v3}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    new-instance v1, Ls7/f;

    const-string v2, "ko_kr"

    const-string v3, "ko"

    invoke-direct {v1, v2, v3}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    new-instance v1, Ls7/f;

    const-string v2, "pt_br"

    const-string v3, "pt"

    invoke-direct {v1, v2, v3}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    new-instance v1, Ls7/f;

    const-string v2, "ru_ru"

    const-string v3, "ru"

    invoke-direct {v1, v2, v3}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    new-instance v1, Ls7/f;

    const-string v2, "th_th"

    const-string v3, "th"

    invoke-direct {v1, v2, v3}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    new-instance v1, Ls7/f;

    const-string v2, "tr_tr"

    const-string v3, "tr"

    invoke-direct {v1, v2, v3}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    new-instance v1, Ls7/f;

    const-string v2, "vi_vn"

    const-string v3, "vi"

    invoke-direct {v1, v2, v3}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    new-instance v1, Ls7/f;

    const-string v2, "zh_tw"

    const-string v3, "zh_TW"

    invoke-direct {v1, v2, v3}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    invoke-static {}, Lc9/l;->g()Z

    move-result v0

    const-string v1, "zh_CN"

    if-eqz v0, :cond_0

    .line 21
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    new-instance v2, Ls7/f;

    const-string v3, "zh_cjv"

    invoke-direct {v2, v3, v1}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 22
    :cond_0
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    new-instance v2, Ls7/f;

    const-string v3, "zh_cn"

    invoke-direct {v2, v3, v1}, Ls7/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls7/f;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Ls7/f;->b:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)Ls7/f;
    .locals 5

    .line 1
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls7/f;

    .line 2
    invoke-virtual {v1}, Ls7/f;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 3
    invoke-virtual {v1}, Ls7/f;->c()Ljava/lang/String;

    move-result-object v2

    const-string v3, "_"

    invoke-virtual {p0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    return-object v1

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Ls7/f;
    .locals 3

    .line 1
    sget-object v0, Ls7/f;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls7/f;

    .line 2
    invoke-virtual {v1}, Ls7/f;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls7/f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls7/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LocaleValue{\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls7/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\',\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls7/f;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
