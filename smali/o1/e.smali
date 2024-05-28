.class public Lo1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo1/e$a;
    }
.end annotation


# static fields
.field public static final e:Lo1/e;

.field public static final f:Lo1/e;


# instance fields
.field private a:Z

.field private b:Ljava/lang/Long;

.field private c:Ljava/lang/Integer;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lo1/e$a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo1/e$a;-><init>(Z)V

    sput-object v0, Lo1/e;->e:Lo1/e;

    .line 2
    new-instance v0, Lo1/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo1/e$a;-><init>(Z)V

    sput-object v0, Lo1/e;->f:Lo1/e;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lo1/e;->d:Z

    .line 3
    iput-boolean p1, p0, Lo1/e;->a:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lo1/e;->b:Ljava/lang/Long;

    return-object v0
.end method

.method public b()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lo1/e;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lo1/e;->a:Z

    return v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lo1/e;->d:Z

    return v0
.end method
