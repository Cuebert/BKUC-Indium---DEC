.class public final enum Lcom/roblox/client/components/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/client/components/o;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Lcom/roblox/client/components/o;

.field public static final enum p:Lcom/roblox/client/components/o;

.field public static final enum q:Lcom/roblox/client/components/o;

.field private static final synthetic r:[Lcom/roblox/client/components/o;


# instance fields
.field private n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/roblox/client/components/o;

    const-string v1, "ALL"

    const/4 v2, 0x0

    const-string v3, "all"

    invoke-direct {v0, v1, v2, v3}, Lcom/roblox/client/components/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/roblox/client/components/o;->o:Lcom/roblox/client/components/o;

    new-instance v1, Lcom/roblox/client/components/o;

    const-string v3, "NONE"

    const/4 v4, 0x1

    const-string v5, "none"

    invoke-direct {v1, v3, v4, v5}, Lcom/roblox/client/components/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/roblox/client/components/o;->p:Lcom/roblox/client/components/o;

    new-instance v3, Lcom/roblox/client/components/o;

    const-string v5, "MORE_ONLY"

    const/4 v6, 0x2

    const-string v7, "more"

    invoke-direct {v3, v5, v6, v7}, Lcom/roblox/client/components/o;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/roblox/client/components/o;->q:Lcom/roblox/client/components/o;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/roblox/client/components/o;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 2
    sput-object v5, Lcom/roblox/client/components/o;->r:[Lcom/roblox/client/components/o;

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
    iput-object p3, p0, Lcom/roblox/client/components/o;->n:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/lang/String;)Lcom/roblox/client/components/o;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 2
    sget-object v0, Lcom/roblox/client/components/o;->o:Lcom/roblox/client/components/o;

    invoke-virtual {v0}, Lcom/roblox/client/components/o;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 3
    :cond_0
    sget-object v0, Lcom/roblox/client/components/o;->q:Lcom/roblox/client/components/o;

    invoke-virtual {v0}, Lcom/roblox/client/components/o;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-object v0

    .line 4
    :cond_1
    sget-object p0, Lcom/roblox/client/components/o;->p:Lcom/roblox/client/components/o;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/client/components/o;
    .locals 1

    const-class v0, Lcom/roblox/client/components/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/client/components/o;

    return-object p0
.end method

.method public static values()[Lcom/roblox/client/components/o;
    .locals 1

    sget-object v0, Lcom/roblox/client/components/o;->r:[Lcom/roblox/client/components/o;

    invoke-virtual {v0}, [Lcom/roblox/client/components/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/client/components/o;

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/components/o;->n:Ljava/lang/String;

    return-object v0
.end method
