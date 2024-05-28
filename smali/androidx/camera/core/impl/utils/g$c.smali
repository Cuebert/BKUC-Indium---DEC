.class public final enum Landroidx/camera/core/impl/utils/g$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/utils/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/core/impl/utils/g$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Landroidx/camera/core/impl/utils/g$c;

.field public static final enum o:Landroidx/camera/core/impl/utils/g$c;

.field private static final synthetic p:[Landroidx/camera/core/impl/utils/g$c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Landroidx/camera/core/impl/utils/g$c;

    const-string v1, "AUTO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/utils/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/utils/g$c;->n:Landroidx/camera/core/impl/utils/g$c;

    .line 2
    new-instance v1, Landroidx/camera/core/impl/utils/g$c;

    const-string v3, "MANUAL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Landroidx/camera/core/impl/utils/g$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Landroidx/camera/core/impl/utils/g$c;->o:Landroidx/camera/core/impl/utils/g$c;

    const/4 v3, 0x2

    new-array v3, v3, [Landroidx/camera/core/impl/utils/g$c;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Landroidx/camera/core/impl/utils/g$c;->p:[Landroidx/camera/core/impl/utils/g$c;

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

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/core/impl/utils/g$c;
    .locals 1

    const-class v0, Landroidx/camera/core/impl/utils/g$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/impl/utils/g$c;

    return-object p0
.end method

.method public static values()[Landroidx/camera/core/impl/utils/g$c;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/utils/g$c;->p:[Landroidx/camera/core/impl/utils/g$c;

    invoke-virtual {v0}, [Landroidx/camera/core/impl/utils/g$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/impl/utils/g$c;

    return-object v0
.end method
