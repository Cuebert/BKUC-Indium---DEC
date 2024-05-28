.class public final enum Lqa/q;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqa/q;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Lqa/q;

.field public static final enum p:Lqa/q;

.field public static final enum q:Lqa/q;

.field private static final synthetic r:[Lqa/q;


# instance fields
.field final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lqa/q;

    const-string v1, "NO_CACHE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lqa/q;->o:Lqa/q;

    .line 2
    new-instance v1, Lqa/q;

    const-string v4, "NO_STORE"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lqa/q;->p:Lqa/q;

    .line 3
    new-instance v4, Lqa/q;

    const-string v6, "OFFLINE"

    const/4 v7, 0x4

    invoke-direct {v4, v6, v5, v7}, Lqa/q;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lqa/q;->q:Lqa/q;

    const/4 v6, 0x3

    new-array v6, v6, [Lqa/q;

    aput-object v0, v6, v2

    aput-object v1, v6, v3

    aput-object v4, v6, v5

    .line 4
    sput-object v6, Lqa/q;->r:[Lqa/q;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lqa/q;->n:I

    return-void
.end method

.method public static b(I)Z
    .locals 1

    sget-object v0, Lqa/q;->q:Lqa/q;

    iget v0, v0, Lqa/q;->n:I

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static c(I)Z
    .locals 1

    sget-object v0, Lqa/q;->o:Lqa/q;

    iget v0, v0, Lqa/q;->n:I

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static d(I)Z
    .locals 1

    sget-object v0, Lqa/q;->p:Lqa/q;

    iget v0, v0, Lqa/q;->n:I

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lqa/q;
    .locals 1

    const-class v0, Lqa/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqa/q;

    return-object p0
.end method

.method public static values()[Lqa/q;
    .locals 1

    sget-object v0, Lqa/q;->r:[Lqa/q;

    invoke-virtual {v0}, [Lqa/q;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqa/q;

    return-object v0
.end method
