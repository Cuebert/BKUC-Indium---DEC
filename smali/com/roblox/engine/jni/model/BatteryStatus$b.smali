.class public final enum Lcom/roblox/engine/jni/model/BatteryStatus$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/model/BatteryStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/engine/jni/model/BatteryStatus$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AC:Lcom/roblox/engine/jni/model/BatteryStatus$b;

.field public static final enum DOCK:Lcom/roblox/engine/jni/model/BatteryStatus$b;

.field public static final enum NOT_PLUGGED:Lcom/roblox/engine/jni/model/BatteryStatus$b;

.field public static final enum UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$b;

.field public static final enum USB:Lcom/roblox/engine/jni/model/BatteryStatus$b;

.field public static final enum WIRELESS:Lcom/roblox/engine/jni/model/BatteryStatus$b;

.field private static final synthetic n:[Lcom/roblox/engine/jni/model/BatteryStatus$b;


# instance fields
.field public final androidValue:I

.field public final robloxValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/roblox/engine/jni/model/BatteryStatus$b;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->UNKNOWN:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    .line 2
    new-instance v1, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    const-string v3, "NOT_PLUGGED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2, v2}, Lcom/roblox/engine/jni/model/BatteryStatus$b;-><init>(Ljava/lang/String;III)V

    sput-object v1, Lcom/roblox/engine/jni/model/BatteryStatus$b;->NOT_PLUGGED:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    .line 3
    new-instance v3, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    const-string v5, "AC"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v4, v4}, Lcom/roblox/engine/jni/model/BatteryStatus$b;-><init>(Ljava/lang/String;III)V

    sput-object v3, Lcom/roblox/engine/jni/model/BatteryStatus$b;->AC:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    .line 4
    new-instance v5, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    const-string v7, "USB"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v6, v6}, Lcom/roblox/engine/jni/model/BatteryStatus$b;-><init>(Ljava/lang/String;III)V

    sput-object v5, Lcom/roblox/engine/jni/model/BatteryStatus$b;->USB:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    .line 5
    new-instance v7, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    const-string v9, "WIRELESS"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10, v10}, Lcom/roblox/engine/jni/model/BatteryStatus$b;-><init>(Ljava/lang/String;III)V

    sput-object v7, Lcom/roblox/engine/jni/model/BatteryStatus$b;->WIRELESS:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    .line 6
    new-instance v9, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    const-string v11, "DOCK"

    const/4 v12, 0x5

    const/16 v13, 0x8

    invoke-direct {v9, v11, v12, v13, v13}, Lcom/roblox/engine/jni/model/BatteryStatus$b;-><init>(Ljava/lang/String;III)V

    sput-object v9, Lcom/roblox/engine/jni/model/BatteryStatus$b;->DOCK:Lcom/roblox/engine/jni/model/BatteryStatus$b;

    const/4 v11, 0x6

    new-array v11, v11, [Lcom/roblox/engine/jni/model/BatteryStatus$b;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    .line 7
    sput-object v11, Lcom/roblox/engine/jni/model/BatteryStatus$b;->n:[Lcom/roblox/engine/jni/model/BatteryStatus$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->robloxValue:I

    .line 3
    iput p4, p0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->androidValue:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/engine/jni/model/BatteryStatus$b;
    .locals 1

    const-class v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/engine/jni/model/BatteryStatus$b;

    return-object p0
.end method

.method public static values()[Lcom/roblox/engine/jni/model/BatteryStatus$b;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/model/BatteryStatus$b;->n:[Lcom/roblox/engine/jni/model/BatteryStatus$b;

    invoke-virtual {v0}, [Lcom/roblox/engine/jni/model/BatteryStatus$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/engine/jni/model/BatteryStatus$b;

    return-object v0
.end method
