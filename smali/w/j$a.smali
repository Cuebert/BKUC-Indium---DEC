.class public final enum Lw/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw/j$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lw/j$a;

.field private static final synthetic o:[Lw/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lw/j$a;

    const-string v1, "ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw/j$a;->n:Lw/j$a;

    const/4 v1, 0x1

    new-array v1, v1, [Lw/j$a;

    aput-object v0, v1, v2

    .line 2
    sput-object v1, Lw/j$a;->o:[Lw/j$a;

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

.method public static valueOf(Ljava/lang/String;)Lw/j$a;
    .locals 1

    const-class v0, Lw/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw/j$a;

    return-object p0
.end method

.method public static values()[Lw/j$a;
    .locals 1

    sget-object v0, Lw/j$a;->o:[Lw/j$a;

    invoke-virtual {v0}, [Lw/j$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw/j$a;

    return-object v0
.end method
