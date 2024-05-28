.class public final enum Lwa/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lwa/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lwa/a;

.field public static final enum o:Lwa/a;

.field public static final enum p:Lwa/a;

.field private static final synthetic q:[Lwa/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwa/a;

    const-string v1, "COROUTINE_SUSPENDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwa/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwa/a;->n:Lwa/a;

    new-instance v0, Lwa/a;

    const-string v1, "UNDECIDED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lwa/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwa/a;->o:Lwa/a;

    new-instance v0, Lwa/a;

    const-string v1, "RESUMED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lwa/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwa/a;->p:Lwa/a;

    invoke-static {}, Lwa/a;->b()[Lwa/a;

    move-result-object v0

    sput-object v0, Lwa/a;->q:[Lwa/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic b()[Lwa/a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lwa/a;

    sget-object v1, Lwa/a;->n:Lwa/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lwa/a;->o:Lwa/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lwa/a;->p:Lwa/a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lwa/a;
    .locals 1

    const-class v0, Lwa/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwa/a;

    return-object p0
.end method

.method public static values()[Lwa/a;
    .locals 1

    sget-object v0, Lwa/a;->q:[Lwa/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwa/a;

    return-object v0
.end method
