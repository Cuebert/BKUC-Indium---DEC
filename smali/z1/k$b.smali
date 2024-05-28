.class public final enum Lz1/k$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lz1/k$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Lz1/k$b;

.field public static final enum p:Lz1/k$b;

.field private static final synthetic q:[Lz1/k$b;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lz1/k$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lz1/k$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lz1/k$b;->o:Lz1/k$b;

    .line 2
    new-instance v1, Lz1/k$b;

    const-string v3, "ANDROID_FIREBASE"

    const/4 v4, 0x1

    const/16 v5, 0x17

    invoke-direct {v1, v3, v4, v5}, Lz1/k$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lz1/k$b;->p:Lz1/k$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lz1/k$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lz1/k$b;->q:[Lz1/k$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lz1/k$b;->n:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lz1/k$b;
    .locals 1

    const-class v0, Lz1/k$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz1/k$b;

    return-object p0
.end method

.method public static values()[Lz1/k$b;
    .locals 1

    sget-object v0, Lz1/k$b;->q:[Lz1/k$b;

    invoke-virtual {v0}, [Lz1/k$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz1/k$b;

    return-object v0
.end method
