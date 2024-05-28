.class public final enum Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/NativeVideoInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ImageOrientation"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final enum o:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final enum p:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final enum q:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final enum r:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final enum s:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final enum t:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field public static final enum u:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

.field private static final synthetic v:[Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v1, "Normal"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->n:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    .line 2
    new-instance v1, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v3, "FlipHorizontal"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->o:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    .line 3
    new-instance v3, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v5, "Rotate180"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->p:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    .line 4
    new-instance v5, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v7, "FlipVertical"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->q:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    .line 5
    new-instance v7, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v9, "Transpose"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->r:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    .line 6
    new-instance v9, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v11, "Rotate90"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->s:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    .line 7
    new-instance v11, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v13, "Transverse"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->t:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    .line 8
    new-instance v13, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const-string v15, "Rotate270"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->u:Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    const/16 v15, 0x8

    new-array v15, v15, [Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    aput-object v0, v15, v2

    aput-object v1, v15, v4

    aput-object v3, v15, v6

    aput-object v5, v15, v8

    aput-object v7, v15, v10

    aput-object v9, v15, v12

    const/4 v0, 0x6

    aput-object v11, v15, v0

    aput-object v13, v15, v14

    .line 9
    sput-object v15, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->v:[Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;
    .locals 1

    const-class v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    return-object p0
.end method

.method public static values()[Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->v:[Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    invoke-virtual {v0}, [Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;

    return-object v0
.end method
