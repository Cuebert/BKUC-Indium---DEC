.class public final Lkb/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkb/h0;
.implements Lkb/l;


# static fields
.field public static final n:Lkb/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkb/f1;

    invoke-direct {v0}, Lkb/f1;-><init>()V

    sput-object v0, Lkb/f1;->n:Lkb/f1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    return-void
.end method

.method public e(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonDisposableHandle"

    return-object v0
.end method
