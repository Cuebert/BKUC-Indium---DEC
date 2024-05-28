.class public final enum Lqa/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqa/p;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Lqa/p;

.field public static final enum p:Lqa/p;

.field private static final synthetic q:[Lqa/p;


# instance fields
.field final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lqa/p;

    const-string v1, "NO_CACHE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lqa/p;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lqa/p;->o:Lqa/p;

    .line 2
    new-instance v1, Lqa/p;

    const-string v4, "NO_STORE"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lqa/p;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lqa/p;->p:Lqa/p;

    new-array v4, v5, [Lqa/p;

    aput-object v0, v4, v2

    aput-object v1, v4, v3

    .line 3
    sput-object v4, Lqa/p;->q:[Lqa/p;

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
    iput p3, p0, Lqa/p;->n:I

    return-void
.end method

.method static b(I)Z
    .locals 1

    sget-object v0, Lqa/p;->o:Lqa/p;

    iget v0, v0, Lqa/p;->n:I

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static c(I)Z
    .locals 1

    sget-object v0, Lqa/p;->p:Lqa/p;

    iget v0, v0, Lqa/p;->n:I

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lqa/p;
    .locals 1

    const-class v0, Lqa/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqa/p;

    return-object p0
.end method

.method public static values()[Lqa/p;
    .locals 1

    sget-object v0, Lqa/p;->q:[Lqa/p;

    invoke-virtual {v0}, [Lqa/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqa/p;

    return-object v0
.end method
