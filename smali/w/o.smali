.class public final enum Lw/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw/o;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lw/o;

.field public static final enum o:Lw/o;

.field public static final enum p:Lw/o;

.field public static final enum q:Lw/o;

.field private static final synthetic r:[Lw/o;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lw/o;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw/o;->n:Lw/o;

    .line 2
    new-instance v1, Lw/o;

    const-string v3, "NONE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lw/o;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw/o;->o:Lw/o;

    .line 3
    new-instance v3, Lw/o;

    const-string v5, "READY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lw/o;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lw/o;->p:Lw/o;

    .line 4
    new-instance v5, Lw/o;

    const-string v7, "FIRED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lw/o;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lw/o;->q:Lw/o;

    const/4 v7, 0x4

    new-array v7, v7, [Lw/o;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lw/o;->r:[Lw/o;

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

.method public static valueOf(Ljava/lang/String;)Lw/o;
    .locals 1

    const-class v0, Lw/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw/o;

    return-object p0
.end method

.method public static values()[Lw/o;
    .locals 1

    sget-object v0, Lw/o;->r:[Lw/o;

    invoke-virtual {v0}, [Lw/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw/o;

    return-object v0
.end method
