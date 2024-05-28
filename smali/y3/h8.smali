.class public final enum Ly3/h8;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly3/h8;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Ly3/h8;

.field public static final enum o:Ly3/h8;

.field public static final enum p:Ly3/h8;

.field private static final synthetic q:[Ly3/h8;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ly3/h8;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    .line 1
    invoke-direct {v0, v1, v2}, Ly3/h8;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly3/h8;->n:Ly3/h8;

    new-instance v1, Ly3/h8;

    const-string v3, "SIGNED"

    const/4 v4, 0x1

    .line 2
    invoke-direct {v1, v3, v4}, Ly3/h8;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ly3/h8;->o:Ly3/h8;

    new-instance v3, Ly3/h8;

    const-string v5, "FIXED"

    const/4 v6, 0x2

    .line 3
    invoke-direct {v3, v5, v6}, Ly3/h8;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ly3/h8;->p:Ly3/h8;

    const/4 v5, 0x3

    new-array v5, v5, [Ly3/h8;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Ly3/h8;->q:[Ly3/h8;

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

.method public static values()[Ly3/h8;
    .locals 1

    sget-object v0, Ly3/h8;->q:[Ly3/h8;

    invoke-virtual {v0}, [Ly3/h8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly3/h8;

    return-object v0
.end method
