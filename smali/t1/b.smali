.class public abstract Lt1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt1/g;

.field b:Lt1/b;

.field public c:J


# direct methods
.method protected constructor <init>(Lt1/g;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    iput-wide v0, p0, Lt1/b;->c:J

    .line 3
    iput-object p1, p0, Lt1/b;->a:Lt1/g;

    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method final b()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lt1/b;->b:Lt1/b;

    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    iput-wide v0, p0, Lt1/b;->c:J

    .line 3
    invoke-virtual {p0}, Lt1/b;->a()V

    return-void
.end method
