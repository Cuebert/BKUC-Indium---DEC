.class public final Lt3/o2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lt3/s2;

.field private final b:Lt3/s2;


# direct methods
.method public constructor <init>(Lt3/s2;Lt3/s2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/o2;->a:Lt3/s2;

    iput-object p2, p0, Lt3/o2;->b:Lt3/s2;

    return-void
.end method


# virtual methods
.method public final a()Lt3/s2;
    .locals 1

    iget-object v0, p0, Lt3/o2;->a:Lt3/s2;

    return-object v0
.end method

.method public final b()Lt3/s2;
    .locals 1

    iget-object v0, p0, Lt3/o2;->b:Lt3/s2;

    return-object v0
.end method
