.class public final enum Lcom/roblox/client/components/RbxProgressButton$i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/components/RbxProgressButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/client/components/RbxProgressButton$i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lcom/roblox/client/components/RbxProgressButton$i;

.field public static final enum o:Lcom/roblox/client/components/RbxProgressButton$i;

.field public static final enum p:Lcom/roblox/client/components/RbxProgressButton$i;

.field private static final synthetic q:[Lcom/roblox/client/components/RbxProgressButton$i;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/roblox/client/components/RbxProgressButton$i;

    const-string v1, "BUTTON"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/components/RbxProgressButton$i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/components/RbxProgressButton$i;->n:Lcom/roblox/client/components/RbxProgressButton$i;

    .line 2
    new-instance v1, Lcom/roblox/client/components/RbxProgressButton$i;

    const-string v3, "ANIMATING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/roblox/client/components/RbxProgressButton$i;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/roblox/client/components/RbxProgressButton$i;->o:Lcom/roblox/client/components/RbxProgressButton$i;

    .line 3
    new-instance v3, Lcom/roblox/client/components/RbxProgressButton$i;

    const-string v5, "PROGRESS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/roblox/client/components/RbxProgressButton$i;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/roblox/client/components/RbxProgressButton$i;->p:Lcom/roblox/client/components/RbxProgressButton$i;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/roblox/client/components/RbxProgressButton$i;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lcom/roblox/client/components/RbxProgressButton$i;->q:[Lcom/roblox/client/components/RbxProgressButton$i;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/client/components/RbxProgressButton$i;
    .locals 1

    const-class v0, Lcom/roblox/client/components/RbxProgressButton$i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/client/components/RbxProgressButton$i;

    return-object p0
.end method

.method public static values()[Lcom/roblox/client/components/RbxProgressButton$i;
    .locals 1

    sget-object v0, Lcom/roblox/client/components/RbxProgressButton$i;->q:[Lcom/roblox/client/components/RbxProgressButton$i;

    invoke-virtual {v0}, [Lcom/roblox/client/components/RbxProgressButton$i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/client/components/RbxProgressButton$i;

    return-object v0
.end method
