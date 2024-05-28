.class public final enum Ly8/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly8/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Ly8/f;

.field public static final enum p:Ly8/f;

.field public static final enum q:Ly8/f;

.field private static final synthetic r:[Ly8/f;


# instance fields
.field private n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ly8/f;

    const-string v1, "LIGHT"

    const/4 v2, 0x0

    const-string v3, "Light"

    invoke-direct {v0, v1, v2, v3}, Ly8/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ly8/f;->o:Ly8/f;

    new-instance v1, Ly8/f;

    const-string v3, "DARK"

    const/4 v4, 0x1

    const-string v5, "Dark"

    invoke-direct {v1, v3, v4, v5}, Ly8/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ly8/f;->p:Ly8/f;

    new-instance v3, Ly8/f;

    const-string v5, "CLASSIC"

    const/4 v6, 0x2

    const-string v7, "Classic"

    invoke-direct {v3, v5, v6, v7}, Ly8/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Ly8/f;->q:Ly8/f;

    const/4 v5, 0x3

    new-array v5, v5, [Ly8/f;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 2
    sput-object v5, Ly8/f;->r:[Ly8/f;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Ly8/f;->n:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/lang/String;)Ly8/f;
    .locals 4

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, "default"

    :goto_0
    const/4 v0, -0x1

    .line 2
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x2eef76

    const/4 v3, 0x1

    if-eq v1, v2, :cond_3

    const v2, 0x6233516

    if-eq v1, v2, :cond_2

    const v2, 0x32e13892

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "classic"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 v0, 0x2

    goto :goto_1

    :cond_2
    const-string v1, "light"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    const-string v1, "dark"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    :cond_4
    :goto_1
    if-eqz v0, :cond_6

    if-eq v0, v3, :cond_5

    .line 3
    sget-object p0, Ly8/f;->q:Ly8/f;

    return-object p0

    .line 4
    :cond_5
    sget-object p0, Ly8/f;->p:Ly8/f;

    return-object p0

    .line 5
    :cond_6
    sget-object p0, Ly8/f;->o:Ly8/f;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Ly8/f;
    .locals 1

    const-class v0, Ly8/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly8/f;

    return-object p0
.end method

.method public static values()[Ly8/f;
    .locals 1

    sget-object v0, Ly8/f;->r:[Ly8/f;

    invoke-virtual {v0}, [Ly8/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly8/f;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly8/f;->n:Ljava/lang/String;

    return-object v0
.end method
