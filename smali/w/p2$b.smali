.class public final enum Lw/p2$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/p2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw/p2$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lw/p2$b;

.field public static final enum o:Lw/p2$b;

.field public static final enum p:Lw/p2$b;

.field public static final enum q:Lw/p2$b;

.field private static final synthetic r:[Lw/p2$b;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lw/p2$b;

    const-string v1, "IMAGE_CAPTURE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw/p2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw/p2$b;->n:Lw/p2$b;

    .line 2
    new-instance v1, Lw/p2$b;

    const-string v3, "PREVIEW"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lw/p2$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw/p2$b;->o:Lw/p2$b;

    .line 3
    new-instance v3, Lw/p2$b;

    const-string v5, "IMAGE_ANALYSIS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lw/p2$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lw/p2$b;->p:Lw/p2$b;

    .line 4
    new-instance v5, Lw/p2$b;

    const-string v7, "VIDEO_CAPTURE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lw/p2$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lw/p2$b;->q:Lw/p2$b;

    const/4 v7, 0x4

    new-array v7, v7, [Lw/p2$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lw/p2$b;->r:[Lw/p2$b;

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

.method public static valueOf(Ljava/lang/String;)Lw/p2$b;
    .locals 1

    const-class v0, Lw/p2$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw/p2$b;

    return-object p0
.end method

.method public static values()[Lw/p2$b;
    .locals 1

    sget-object v0, Lw/p2$b;->r:[Lw/p2$b;

    invoke-virtual {v0}, [Lw/p2$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw/p2$b;

    return-object v0
.end method
