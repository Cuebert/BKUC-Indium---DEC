.class public final Lu0/b;
.super Lu0/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu0/b$a;
    }
.end annotation


# static fields
.field public static final b:Lu0/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu0/b$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lu0/b;->b:Lu0/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "androidx.credentials.TYPE_CONSTRAINT_ERROR"

    invoke-direct {p0, v0}, Lu0/e;-><init>(Ljava/lang/String;)V

    return-void
.end method
