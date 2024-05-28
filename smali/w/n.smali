.class public final enum Lw/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw/n;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lw/n;

.field public static final enum o:Lw/n;

.field public static final enum p:Lw/n;

.field public static final enum q:Lw/n;

.field public static final enum r:Lw/n;

.field private static final synthetic s:[Lw/n;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lw/n;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw/n;->n:Lw/n;

    .line 2
    new-instance v1, Lw/n;

    const-string v3, "INACTIVE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lw/n;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw/n;->o:Lw/n;

    .line 3
    new-instance v3, Lw/n;

    const-string v5, "METERING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lw/n;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lw/n;->p:Lw/n;

    .line 4
    new-instance v5, Lw/n;

    const-string v7, "CONVERGED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lw/n;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lw/n;->q:Lw/n;

    .line 5
    new-instance v7, Lw/n;

    const-string v9, "LOCKED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lw/n;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lw/n;->r:Lw/n;

    const/4 v9, 0x5

    new-array v9, v9, [Lw/n;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    .line 6
    sput-object v9, Lw/n;->s:[Lw/n;

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

.method public static valueOf(Ljava/lang/String;)Lw/n;
    .locals 1

    const-class v0, Lw/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw/n;

    return-object p0
.end method

.method public static values()[Lw/n;
    .locals 1

    sget-object v0, Lw/n;->s:[Lw/n;

    invoke-virtual {v0}, [Lw/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw/n;

    return-object v0
.end method
