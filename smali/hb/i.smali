.class public final enum Lhb/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhb/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lhb/i;

.field public static final enum o:Lhb/i;

.field public static final enum p:Lhb/i;

.field public static final enum q:Lhb/i;

.field private static final synthetic r:[Lhb/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lhb/i;

    const-string v1, "PUBLIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhb/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhb/i;->n:Lhb/i;

    .line 2
    new-instance v0, Lhb/i;

    const-string v1, "PROTECTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhb/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhb/i;->o:Lhb/i;

    .line 3
    new-instance v0, Lhb/i;

    const-string v1, "INTERNAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhb/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhb/i;->p:Lhb/i;

    .line 4
    new-instance v0, Lhb/i;

    const-string v1, "PRIVATE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lhb/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhb/i;->q:Lhb/i;

    invoke-static {}, Lhb/i;->b()[Lhb/i;

    move-result-object v0

    sput-object v0, Lhb/i;->r:[Lhb/i;

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

.method private static final synthetic b()[Lhb/i;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lhb/i;

    sget-object v1, Lhb/i;->n:Lhb/i;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lhb/i;->o:Lhb/i;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lhb/i;->p:Lhb/i;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lhb/i;->q:Lhb/i;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhb/i;
    .locals 1

    const-class v0, Lhb/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhb/i;

    return-object p0
.end method

.method public static values()[Lhb/i;
    .locals 1

    sget-object v0, Lhb/i;->r:[Lhb/i;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhb/i;

    return-object v0
.end method
