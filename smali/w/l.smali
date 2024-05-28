.class public final enum Lw/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lw/l;

.field public static final enum o:Lw/l;

.field public static final enum p:Lw/l;

.field public static final enum q:Lw/l;

.field private static final synthetic r:[Lw/l;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lw/l;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw/l;->n:Lw/l;

    .line 2
    new-instance v1, Lw/l;

    const-string v3, "OFF"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lw/l;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw/l;->o:Lw/l;

    .line 3
    new-instance v3, Lw/l;

    const-string v5, "ON_MANUAL_AUTO"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lw/l;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lw/l;->p:Lw/l;

    .line 4
    new-instance v5, Lw/l;

    const-string v7, "ON_CONTINUOUS_AUTO"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lw/l;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lw/l;->q:Lw/l;

    const/4 v7, 0x4

    new-array v7, v7, [Lw/l;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lw/l;->r:[Lw/l;

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

.method public static valueOf(Ljava/lang/String;)Lw/l;
    .locals 1

    const-class v0, Lw/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw/l;

    return-object p0
.end method

.method public static values()[Lw/l;
    .locals 1

    sget-object v0, Lw/l;->r:[Lw/l;

    invoke-virtual {v0}, [Lw/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw/l;

    return-object v0
.end method
