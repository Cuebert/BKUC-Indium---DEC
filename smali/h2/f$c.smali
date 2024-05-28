.class public final enum Lh2/f$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lh2/f$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lh2/f$c;

.field public static final enum o:Lh2/f$c;

.field public static final enum p:Lh2/f$c;

.field private static final synthetic q:[Lh2/f$c;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lh2/f$c;

    const-string v1, "NETWORK_UNMETERED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh2/f$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh2/f$c;->n:Lh2/f$c;

    .line 2
    new-instance v1, Lh2/f$c;

    const-string v3, "DEVICE_IDLE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lh2/f$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lh2/f$c;->o:Lh2/f$c;

    .line 3
    new-instance v3, Lh2/f$c;

    const-string v5, "DEVICE_CHARGING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lh2/f$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lh2/f$c;->p:Lh2/f$c;

    const/4 v5, 0x3

    new-array v5, v5, [Lh2/f$c;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lh2/f$c;->q:[Lh2/f$c;

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

.method public static valueOf(Ljava/lang/String;)Lh2/f$c;
    .locals 1

    const-class v0, Lh2/f$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh2/f$c;

    return-object p0
.end method

.method public static values()[Lh2/f$c;
    .locals 1

    sget-object v0, Lh2/f$c;->q:[Lh2/f$c;

    invoke-virtual {v0}, [Lh2/f$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh2/f$c;

    return-object v0
.end method
