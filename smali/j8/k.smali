.class public final enum Lj8/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj8/k;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lj8/k;

.field public static final enum o:Lj8/k;

.field public static final enum p:Lj8/k;

.field public static final enum q:Lj8/k;

.field private static final synthetic r:[Lj8/k;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lj8/k;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj8/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj8/k;->n:Lj8/k;

    .line 2
    new-instance v1, Lj8/k;

    const-string v3, "FIREBASE_CLOUD_MESSAGING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lj8/k;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj8/k;->o:Lj8/k;

    .line 3
    new-instance v3, Lj8/k;

    const-string v5, "AMAZON_DEVICE_MESSAGING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lj8/k;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lj8/k;->p:Lj8/k;

    .line 4
    new-instance v5, Lj8/k;

    const-string v7, "TENCENT_PUSH_NOTIFICATION_SERVICE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lj8/k;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lj8/k;->q:Lj8/k;

    const/4 v7, 0x4

    new-array v7, v7, [Lj8/k;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lj8/k;->r:[Lj8/k;

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

.method public static valueOf(Ljava/lang/String;)Lj8/k;
    .locals 1

    const-class v0, Lj8/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj8/k;

    return-object p0
.end method

.method public static values()[Lj8/k;
    .locals 1

    sget-object v0, Lj8/k;->r:[Lj8/k;

    invoke-virtual {v0}, [Lj8/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj8/k;

    return-object v0
.end method
