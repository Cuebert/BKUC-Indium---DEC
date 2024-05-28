.class public final Lb6/n;
.super Lb6/l;
.source "SourceFile"


# static fields
.field public static final a:Lb6/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb6/n;

    invoke-direct {v0}, Lb6/n;-><init>()V

    sput-object v0, Lb6/n;->a:Lb6/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Lb6/l;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    instance-of p1, p1, Lb6/n;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public hashCode()I
    .locals 1

    const-class v0, Lb6/n;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
