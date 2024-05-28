.class public final enum Lcom/roblox/client/components/RbxProgressButton$j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/components/RbxProgressButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/client/components/RbxProgressButton$j;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lcom/roblox/client/components/RbxProgressButton$j;

.field public static final enum o:Lcom/roblox/client/components/RbxProgressButton$j;

.field private static final synthetic p:[Lcom/roblox/client/components/RbxProgressButton$j;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/roblox/client/components/RbxProgressButton$j;

    const-string v1, "SHOW_BUTTON"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/components/RbxProgressButton$j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/components/RbxProgressButton$j;->n:Lcom/roblox/client/components/RbxProgressButton$j;

    .line 2
    new-instance v1, Lcom/roblox/client/components/RbxProgressButton$j;

    const-string v3, "SHOW_PROGRESS"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/roblox/client/components/RbxProgressButton$j;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/roblox/client/components/RbxProgressButton$j;->o:Lcom/roblox/client/components/RbxProgressButton$j;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/roblox/client/components/RbxProgressButton$j;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lcom/roblox/client/components/RbxProgressButton$j;->p:[Lcom/roblox/client/components/RbxProgressButton$j;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/client/components/RbxProgressButton$j;
    .locals 1

    const-class v0, Lcom/roblox/client/components/RbxProgressButton$j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/client/components/RbxProgressButton$j;

    return-object p0
.end method

.method public static values()[Lcom/roblox/client/components/RbxProgressButton$j;
    .locals 1

    sget-object v0, Lcom/roblox/client/components/RbxProgressButton$j;->p:[Lcom/roblox/client/components/RbxProgressButton$j;

    invoke-virtual {v0}, [Lcom/roblox/client/components/RbxProgressButton$j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/client/components/RbxProgressButton$j;

    return-object v0
.end method
