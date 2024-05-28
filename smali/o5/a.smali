.class public final Lo5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/a$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Lo5/d$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lo5/d$a;->n:Lo5/d$a;

    iput-object v0, p0, Lo5/a;->b:Lo5/d$a;

    return-void
.end method

.method public static b()Lo5/a;
    .locals 1

    new-instance v0, Lo5/a;

    invoke-direct {v0}, Lo5/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lo5/d;
    .locals 3

    new-instance v0, Lo5/a$a;

    iget v1, p0, Lo5/a;->a:I

    iget-object v2, p0, Lo5/a;->b:Lo5/d$a;

    invoke-direct {v0, v1, v2}, Lo5/a$a;-><init>(ILo5/d$a;)V

    return-object v0
.end method

.method public c(I)Lo5/a;
    .locals 0

    iput p1, p0, Lo5/a;->a:I

    return-object p0
.end method
