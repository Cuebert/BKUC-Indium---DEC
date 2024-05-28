.class public interface abstract Lx2/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx2/a$d$c;,
        Lx2/a$d$b;,
        Lx2/a$d$a;
    }
.end annotation


# static fields
.field public static final m:Lx2/a$d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx2/a$d$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx2/a$d$c;-><init>(Lx2/p;)V

    sput-object v0, Lx2/a$d;->m:Lx2/a$d$c;

    return-void
.end method
